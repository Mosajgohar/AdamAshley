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

WebUI.callTestCase(findTestCase('online tutorial/login HRM'), [:], FailureHandling.CONTINUE_ON_FAILURE)

a = WebUI.getWindowIndex()

b = WebUI.getWindowTitle()

WebUI.executeJavaScript('window.open();', [])

not_run: c = WebUI.getText(findTestObject('roughHRM SPY/spy5/Page_OrangeHRM/div_Fri 08 Jan 2021'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl('https://www.random.org/integers/')

WebUI.setText(findTestObject('Object Repository/roughHRM SPY/RegEx/Page_RANDOMORG - Integer Generator/input_Part 1 The Integers_num'), 
    '1')

WebUI.setText(findTestObject('Object Repository/roughHRM SPY/RegEx/Page_RANDOMORG - Integer Generator/input_Part 1 The Integers_min'), 
    '00000')

WebUI.setText(findTestObject('Object Repository/roughHRM SPY/RegEx/Page_RANDOMORG - Integer Generator/input_Part 1 The Integers_max'), 
    '99999')

WebUI.click(findTestObject('Object Repository/roughHRM SPY/RegEx/Page_RANDOMORG - Integer Generator/input_Part 1 The Integers_col'))

WebUI.setText(findTestObject('Object Repository/roughHRM SPY/RegEx/Page_RANDOMORG - Integer Generator/input_Part 1 The Integers_col'), 
    '1')

WebUI.click(findTestObject('Object Repository/roughHRM SPY/RegEx/Page_RANDOMORG - Integer Generator/input'))

c = WebUI.getText(findTestObject('Object Repository/roughHRM SPY/RegEx/Page_RANDOMORG - Integer Generator/pre_6649'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_Dashboard/span_Leave'))

WebUI.click(findTestObject('Object Repository/OrangeDropCheckbox/Page_Dashboard/span_Apply'))

WebUI.setText(findTestObject('Object Repository/OrangeDropCheckbox/Page_Apply Leave/textarea_Duration_comment'), c)

