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

'app launch'
Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

'quick actions- Transfer'
Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/61.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

'enter password'
Mobile.setText(findTestObject('null'), 'pass1234', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/62.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

not_run: WebUI.delay(10)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/63.png', FailureHandling.CONTINUE_ON_FAILURE)

'horizontal swipe'
not_run: Mobile.swipe(890, 1375, 150, 1400)

not_run: WebUI.delay(5)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/64.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tapAtPosition(width * 0.18055, height * 0.41666)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/65.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('null'), 
    0)

not_run: Mobile.setText(findTestObject('null'), 
    '514012029036', 0)

not_run: Mobile.tap(findTestObject('null'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/66.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tapAtPosition(width * 0.84722, height * 0.75416)

not_run: WebUI.delay(2)

'enter RM 0.02'
not_run: Mobile.tap(findTestObject('null'), 0)

'keypad - ok'
not_run: Mobile.tap(findTestObject('null'), 0)

not_run: WebUI.delay(4)

not_run: Mobile.setText(findTestObject('null'), 
    'kat3rdprty', 0)

not_run: Mobile.tap(findTestObject('null'), 
    0)

not_run: WebUI.delay(2)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/67.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/68.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.setText(findTestObject('null'), 
    'instant', 0)

'vertical swipe'
not_run: Mobile.swipe(490, 1440, 490, 770)

not_run: WebUI.delay(3)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/69.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(3)

'horizontal swipe'
not_run: Mobile.swipe(890, 1375, 150, 1400)

not_run: WebUI.delay(3)

'horizontal swipe'
not_run: Mobile.swipe(890, 1375, 150, 1400)

not_run: WebUI.delay(3)

not_run: Mobile.tap(findTestObject('null'), 
    0)

not_run: otpMessageM = Mobile.getText(findTestObject('null'), 0)

not_run: WebUI.delay(3)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/70.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('null'), 
    0)

not_run: WebUI.delay(2)

not_run: for (def i = 16; i <= 21; i++) {
    if ((otpMessageM[i]) == '0') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM[i]) == '1') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM[i]) == '2') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM[i]) == '3') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM[i]) == '4') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM[i]) == '5') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM[i]) == '6') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM[i]) == '7') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM[i]) == '8') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM[i]) == '9') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
}

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: WebUI.delay(5)

not_run: Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/71.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: WebUI.delay(5)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/72.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: WebUI.delay(5)

not_run: Mobile.tap(findTestObject('null'), 
    0)

not_run: Mobile.tap(findTestObject('null'), 
    0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/73.png', FailureHandling.CONTINUE_ON_FAILURE)

'horizontal swipe'
Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(5)

Mobile.tapAtPosition(width * 0.18055, height * 0.41666)

not_run: Mobile.tap(findTestObject('null'), 
    0)

not_run: Mobile.setText(findTestObject('null'), 
    '105151000359', 0)

WebUI.delay(3)

Mobile.tap(findTestObject('null'), 0)

WebUI.delay(3)

Mobile.setText(findTestObject('null'), 
    'hong leong', 0)

WebUI.delay(3)

Mobile.pressBack()

WebUI.delay(3)

Mobile.tapAtPosition(500, 830)

Mobile.tapAtPosition(500, 830)

WebUI.delay(3)

Mobile.setText(findTestObject('null'), '100000089', 
    0)

not_run: Mobile.tap(findTestObject('null'), 
    0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/74.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.84722, height * 0.75416)

WebUI.delay(2)

'enter RM 0.02'
Mobile.tap(findTestObject('null'), 0)

'keypad - ok'
Mobile.tap(findTestObject('null'), 0)

WebUI.delay(4)

Mobile.setText(findTestObject('null'), 'kat3rdprty', 
    0)

Mobile.tap(findTestObject('null'), 
    0)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

Mobile.setText(findTestObject('null'), 'inst', 
    0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/75.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('null'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/76.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/77.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 
    'inst oth bnk', 0)

'vertical swipe'
Mobile.swipe(500, 1500, 500, 800)

WebUI.delay(3)

'horizontal swipe'
Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(3)

'horizontal swipe'
Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(3)

'select account to transfer'
Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 
    0)

not_run: Mobile.tap(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/78.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: otpMessageM1 = Mobile.getText(findTestObject('null'), 0)

not_run: WebUI.delay(2)

not_run: for (def i = 16; i <= 21; i++) {
    if ((otpMessageM1[i]) == '0') {
        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM1[i]) == '1') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM1[i]) == '2') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM1[i]) == '3') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM1[i]) == '4') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM1[i]) == '5') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM1[i]) == '6') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM1[i]) == '7') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM1[i]) == '8') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
    
    if ((otpMessageM1[i]) == '9') {
        not_run: Mobile.tap(findTestObject('null'), 0)

        Mobile.tap(findTestObject('null'), 0)
    }
}

not_run: Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/79.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('null'), 
    0)

not_run: Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/80.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

WebUI.delay(5)

'done'
Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.closeApplication()

