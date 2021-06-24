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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 'Pass@1247', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'hong leong', 0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), '100000089', 0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

not_run: a = Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.verifyEqual(a, 'Amount should be in between RM 0.01 to \nRM  999,999.99 for Fund Transfer.')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/4.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

b = Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.verifyEqual(b, '')

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/8.png', FailureHandling.CONTINUE_ON_FAILURE)

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

not_run: Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'ios IB transfer details', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(5)

Mobile.swipe(200, 550, 200, 150)

WebUI.delay(5)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

def otpMessage = Mobile.getText(findTestObject('null'), 0)

not_run: for (def i = 122; i <= 127; i++) {
    if ((otpMessage[i]) == '0') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage[i]) == '1') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage[i]) == '2') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage[i]) == '3') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage[i]) == '4') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage[i]) == '5') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage[i]) == '6') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage[i]) == '7') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage[i]) == '8') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage[i]) == '9') {
        Mobile.tap(findTestObject('null'), 0)
    }
}

WebUI.delay(5)

not_run: Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

