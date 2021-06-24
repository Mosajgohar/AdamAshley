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

'army_rpp01'
Mobile.startApplication('/Users/mosaj/katalon/IPA/M2ULifeUAT.ipa', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/55.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 'rpp12345', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/56.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/57.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/58.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/59.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/60.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/61.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

def otpMessage = Mobile.getText(findTestObject('null'), 0)

for (def i = 122; i <= 127; i++) {
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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/62.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/63.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/64.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('null'), 0)

def otpMessage1 = Mobile.getText(findTestObject('null'), 0)

for (def i = 122; i <= 127; i++) {
    if ((otpMessage1[i]) == '0') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage1[i]) == '1') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage1[i]) == '2') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage1[i]) == '3') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage1[i]) == '4') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage1[i]) == '5') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage1[i]) == '6') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage1[i]) == '7') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage1[i]) == '8') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessage1[i]) == '9') {
        Mobile.tap(findTestObject('null'), 0)
    }
}

WebUI.delay(5)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/65.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/66.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.closeApplication()

