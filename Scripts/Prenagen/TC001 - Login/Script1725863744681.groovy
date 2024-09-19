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

import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.delay(2)
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/button_Allow'))

WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/div_img alt srcSetimagesiconsdoor_open_soli_3a93d2'))

WebUI.setText(findTestObject('Object Repository/Page_PRENAGEN Club/input_help_outline_PhoneNumber'), '85396140122')

WebUI.setText(findTestObject('Object Repository/Page_PRENAGEN Club/input_Reload Captcha_Captcha'), '0433')

WebUI.delay(2)
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/button_MASUK'))

WebUI.delay(10) //delay to manual input chapta

WebUI.delay(2)
WebUI.takeFullPageScreenshot()

WebUI.delay(2)
Robot rb = new Robot()

WebUI.delay(2)
rb.keyPress(KeyEvent.VK_1)
WebUI.delay(2)
rb.keyPress(KeyEvent.VK_2)
WebUI.delay(2)
rb.keyPress(KeyEvent.VK_1)
WebUI.delay(2)
rb.keyPress(KeyEvent.VK_2)
WebUI.delay(2)
rb.keyPress(KeyEvent.VK_1)
WebUI.delay(2)
rb.keyPress(KeyEvent.VK_2)

WebUI.delay(2)
WebUI.takeFullPageScreenshot()

WebUI.delay(10)

WebUI.delay(2)
WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PRENAGEN Club/p_1.000'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/a_Yuk diisi'))

WebUI.delay(2)
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/Page_Complete_Profile/section_Bonus Poin 1.000Wajib diisi sebelum tukar pointData AlamatMasukkan Informasi Alamat untuk pengiriman hadiah'))

WebUI.delay(2)
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/Page_Complete_Profile/button_SIMPAN'))

WebUI.delay(2)
WebUI.takeFullPageScreenshot()


//WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/section_Bonus Poin 1.500Wajib diisi sebelum_294a60'))
//
//WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/path'))
//
//WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/button_9'))
//
//WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/div_Tanggal LahirLaki-LakiPerempuan'))
//
//WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/div_Laki-Laki'))
//
//WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/div_Perempuan'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PRENAGEN Club/select_Pilih Kondisi AndaPersiapan HamilHam_f88055'), 
//    'Pilih Kondisi Anda', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PRENAGEN Club/select_Pilih Kondisi AndaPersiapan HamilHam_f88055'), 
//    '810101', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PRENAGEN Club/select_Pilih Kondisi AndaPersiapan HamilHam_f88055'), 
//    '810102', true)
//
//WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/i_add'))
//
//WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/div_remove'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PRENAGEN Club/select_Pilih Kondisi AndaPersiapan HamilHam_f88055'), 
//    '810103', true)
//
//WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/svg_Tanggal Lahir Anak_MuiSvgIcon-root MuiS_e51139'))
//
//WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/button_9'))
//
//WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/button_SIMPAN'))
//
//WebUI.click(findTestObject('Object Repository/Page_PRENAGEN Club/button_KEMBALI KE BERANDA'))

