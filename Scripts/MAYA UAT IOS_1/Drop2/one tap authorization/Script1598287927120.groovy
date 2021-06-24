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

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 'pass1234', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

a = Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(a, 'One-Tap Authorisation')

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

b = Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(b, 'Activate Now')

Mobile.tap(findTestObject('null'), 0)

if (Mobile.verifyElementExist(findTestObject('null'), 
    0)) {
    Mobile.getText(findTestObject('null'), 0)

    Mobile.getText(findTestObject('null'), 0)

    Mobile.tap(findTestObject('null'), 0)
}

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

otpMessage = Mobile.getText(findTestObject('null'), 
    0)

for (def i = 16; i <= 21; i++) {
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

WebUI.delay(3)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), '810101104144', 
    0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

c = Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(c, 'One-Tap Authorisation enabled')

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('null'), 0)

d = Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(d, 'Disable One-Tap Authorisation')

e = Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(e, 'Are you sure want to disable One-Tap Authorisation?')

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

