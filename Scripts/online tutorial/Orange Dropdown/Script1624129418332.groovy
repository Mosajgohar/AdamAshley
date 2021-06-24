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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mosajgohar-trials71.orangehrmlive.com/auth/login')

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Object Repository/OrangeDropCheckbox/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeDropCheckbox/Page_OrangeHRM/input_Username_txtPassword'), 
    'io8K/rAkh+VZA/D6tXGgTA==')

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_Dashboard/span_Leave'))

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_Dashboard/span_Apply'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_Apply Leave/input__select-dropdown active'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_Apply Leave/span_Casual Leave'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_Apply Leave/i_date_range'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_Apply Leave/div_23'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/OrangeDropCheckbox/Page_Apply Leave/textarea_Duration_comment'), 'applly leave for 1 day')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_Apply Leave/span_My Leave'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_My Leave List/label_All'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_My Leave List/button_Search'))

WebUI.getText(findTestObject('Object Repository/OrangeDropCheckbox/Page_My Leave List/div_No Records Found'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_My Leave List/label_Pending Approval'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_My Leave List/button_Search'))

WebUI.delay(3)

WebUI.closeBrowser()

