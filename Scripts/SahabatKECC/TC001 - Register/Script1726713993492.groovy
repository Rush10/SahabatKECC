import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.sahabat.kecc.Utils as Utils

WebUI.comment("Test Data ID: " + TestDataID)

WebUI.delay(2)
WebUI.takeFullPageScreenshot()

WebUI.comment("Given: Phone Number (" + PhoneNumber + ")")

WebUI.setText(findTestObject('Object Repository/Page_KECC REWARDS/input_PhoneNumber'), PhoneNumber)

WebUI.comment("And: Referal Code (" + RefCode + ")")

WebUI.setText(findTestObject('Object Repository/Page_KECC REWARDS/input_ReferralCode'), RefCode)

WebUI.comment("And: Term And Condition (" + CheckTAC + ")")

if(CheckTAC.equals("1")) {
	WebUI.check(findTestObject('Object Repository/Page_KECC REWARDS/input_Tos'))	
	
	WebUI.verifyElementChecked(findTestObject('Object Repository/Page_KECC REWARDS/input_Tos'), GlobalVariable.Timeout)
}else {
	WebUI.uncheck(findTestObject('Object Repository/Page_KECC REWARDS/input_Tos'))	
		
	WebUI.verifyElementNotChecked(findTestObject('Object Repository/Page_KECC REWARDS/input_Tos'), GlobalVariable.Timeout)
}

WebUI.comment("When: Click Button Register")

WebUI.delay(2)
WebUI.takeFullPageScreenshot()

if(!RefCode.equals("1234567890123456")) {
	WebUI.click(findTestObject('Object Repository/Page_KECC REWARDS/button_DAFTAR'))	
}

WebUI.comment("Then: " + Expected)

WebUI.delay(2)
WebUI.takeFullPageScreenshot()

if(PhoneNumber.equals("")) {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_KECC REWARDS/Validation/div_Nomer telepon harus diisi'), GlobalVariable.Timeout)
	
	WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_KECC REWARDS/button_DAFTAR'), FailureHandling.STOP_ON_FAILURE)
}else if (PhoneNumber.toString().length() < 7) {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_KECC REWARDS/Validation/div_Harus 7 karakter atau lebih'), GlobalVariable.Timeout)
	
	WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_KECC REWARDS/button_DAFTAR'), FailureHandling.STOP_ON_FAILURE)
}else if(PhoneNumber.toString().substring(0, 1).equals("0")) {
	WebUI.click(findTestObject('Object Repository/Page_KECC REWARDS/span_ButtonX'))
	
	String phoneNumberActualText = WebUI.getText(findTestObject('Object Repository/Page_KECC REWARDS/input_PhoneNumber'))
	String phoneNumberExpectedText = PhoneNumber.toString().substring(1, PhoneNumber.toString().length())
	
	WebUI.comment("phoneNumberActualText: " + phoneNumberActualText)
	WebUI.comment("phoneNumberExpectedText: " + phoneNumberExpectedText)
	
	WebUI.verifyMatch(phoneNumberActualText, phoneNumberExpectedText, false)
}else if(PhoneNumber.toString().substring(0, 2).equals("62")) {
	WebUI.click(findTestObject('Object Repository/Page_KECC REWARDS/span_ButtonX'))
	
	String phoneNumberActualText = WebUI.getText(findTestObject('Object Repository/Page_KECC REWARDS/input_PhoneNumber'))
	String phoneNumberExpectedText = PhoneNumber.toString().substring(2, PhoneNumber.toString().length())
	
	WebUI.comment("phoneNumberActualText: " + phoneNumberActualText)
	WebUI.comment("phoneNumberExpectedText: " + phoneNumberExpectedText)
	
	WebUI.verifyMatch(phoneNumberActualText, phoneNumberExpectedText, false)
}else if(!Utils.isNumeric(PhoneNumber)) {
	String phoneNumberActualText = WebUI.getText(findTestObject('Object Repository/Page_KECC REWARDS/input_PhoneNumber'))
	String phoneNumberExpectedText = ""
	
	WebUI.comment("phoneNumberActualText: " + phoneNumberActualText)
	WebUI.comment("phoneNumberExpectedText: " + phoneNumberExpectedText)
	
	WebUI.verifyMatch(phoneNumberActualText, phoneNumberExpectedText, false)
	
	WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_KECC REWARDS/button_DAFTAR'), FailureHandling.STOP_ON_FAILURE)
}else if(!PhoneNumber.toString().substring(0, 1).equals("8")) {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_KECC REWARDS/Validation/div_Nomor telepon tidak valid'), GlobalVariable.Timeout)
	
	WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_KECC REWARDS/button_DAFTAR'), FailureHandling.STOP_ON_FAILURE)
}

if(RefCode.toString().length() > 15) {
	String refCodeActualText = WebUI.getText(findTestObject('Object Repository/Page_KECC REWARDS/input_ReferralCode'))
	String refCodeExpectedText = RefCode.toString().substring(0, 15)
	
	WebUI.comment("refCodeActualText: " + refCodeActualText)
	WebUI.comment("refCodeExpectedText: " + refCodeExpectedText)
	
	WebUI.verifyMatch(refCodeActualText, refCodeExpectedText, false)
}else if(RefCode.equals("123456789012345")) {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_KECC REWARDS/Validation/span_Referral Code tidak ditemukan'), GlobalVariable.Timeout)
}

if(CheckTAC.equals("0")) {
	WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_KECC REWARDS/button_DAFTAR'), FailureHandling.STOP_ON_FAILURE)
}


