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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'pass1234', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'umobile', 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

a = Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(a, 'Please enter a valid mobile number.')

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/4.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.swipe(350, 480, 20, 480)

WebUI.delay(3)

Mobile.swipe(350, 480, 20, 480)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

not_run: def otpMessage = Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/9.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

b = Mobile.getText(findTestObject('null'), 0)

Mobile.verifyEqual(b, 'Share Receipt')

Mobile.tap(findTestObject('null'), 0)

c = Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(c, 'Share Receipt')

Mobile.tap(findTestObject('null'), 0)

d = Mobile.getText(findTestObject('null'), 0)

Mobile.verifyEqual(d, 'Done')

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

