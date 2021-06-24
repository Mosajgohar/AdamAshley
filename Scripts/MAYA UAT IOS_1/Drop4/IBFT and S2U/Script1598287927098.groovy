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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 'Pass@1278', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'affin bank berhad', 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.tapAtPosition(200, 300)

WebUI.delay(1)

Mobile.tapAtPosition(200, 300)

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), '105151000359', 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

a = Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(a, 'Amount should be in between RM 0.01 to \nRM  999,999.99 for Fund Transfer.')

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 'details', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

b = Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(b, '')

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

WebUI.delay(3)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'ios IBFT RSA', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(5)

Mobile.swipe(200, 450, 200, 150)

WebUI.delay(5)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'hsbc', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(200, 300)

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), '301056628101', 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 'details', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'ios IBFT s2U expired', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(5)

Mobile.swipe(200, 400, 200, 150)

WebUI.delay(5)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/15.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(60)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'hsbc', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.tapAtPosition(200, 300)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), '301056628101', 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 'details', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

WebUI.delay(10)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'ios IBFT s2U REJECT', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(200, 400, 200, 150)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/23.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/24.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/25.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'hsbc', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.tapAtPosition(200, 300)

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), '301056628101', 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/26.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 'details', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

WebUI.delay(3)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/27.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('null'), 'ios IBFT s2U APPROVED', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(5)

Mobile.swipe(200, 400, 200, 150)

WebUI.delay(5)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/28.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/29.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/30.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.closeApplication()

