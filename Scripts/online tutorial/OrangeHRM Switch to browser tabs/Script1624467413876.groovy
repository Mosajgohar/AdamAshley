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

WebUI.callTestCase(findTestCase('online tutorial/login HRM'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('roughHRM SPY/spy5/Page_Dashboard/span_My Shortcuts'))

WebUI.click(findTestObject('roughHRM SPY/spy5/Page_Dashboard/a_OrangeBuzz'))

a = WebUI.getWindowIndex()

b = WebUI.getWindowTitle()

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('roughHRM SPY/spy5/Page_OrangeHRM/textarea_Share Video_createPostcontent'), 'Hello World')

WebUI.click(findTestObject('roughHRM SPY/spy5/Page_OrangeHRM/button_Post'))

WebUI.switchToWindowTitle(b)

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_Dashboard/span_Leave'))

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_Dashboard/span_Apply'))

WebUI.delay(5)

WebUI.switchToWindowUrl('https://mosajgohar-trials71.orangehrmlive.com/buzz/viewBuzz')

