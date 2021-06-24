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

Mobile.startApplication('/Users/mosaj/katalon/IPA/M2ULifeUAT.ipa', false)

WebUI.delay(3)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 'Pass@1278', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

WebUI.delay(2)

Mobile.swipe(180, 650, 180, 500)

WebUI.delay(5)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), '820787M', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 'ios duit BRN', 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.swipe(185, 500, 185, 200)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/20.png', FailureHandling.CONTINUE_ON_FAILURE)

'S2U APPROVE BUTTON'
Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.closeApplication()

