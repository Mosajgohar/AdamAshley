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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mosajgohar-trials71.orangehrmlive.com/auth/login')

for (def row = 1; row <= findTestData('OrangeHRM/Login credentials').getRowNumbers(); row++) {
    WebUI.click(findTestObject('Object Repository/Orange HRM Login/Page_OrangeHRM/span_Username'))

    WebUI.takeScreenshot()

    WebUI.setText(findTestObject('Object Repository/Orange HRM Login/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), findTestData(
            'OrangeHRM/Login credentials').getValue('UserID', row))

    WebUI.setText(findTestObject('Object Repository/Orange HRM Login/Page_OrangeHRM/input_Username_txtPassword'), findTestData(
            'OrangeHRM/Login credentials').getValue('Password', row))

    WebUI.click(findTestObject('Object Repository/Orange HRM Login/Page_OrangeHRM/input_Password_Submit'))

    WebUI.click(findTestObject('roughHRM SPY/spy4/Page_Dashboard/a_Logout'))
}

not_run: a = WebUI.getText(findTestObject('Object Repository/OrangeHRM File upload/Page_Dashboard/span_My Info'))

not_run: WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_Dashboard/span_Leave'))

not_run: if (a == 'My Info1234567') {
    WebUI.click(findTestObject('Object Repository/OrangeHRM File upload/Page_Dashboard/span_My Info'))
}
