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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('null'), 0)

g = Mobile.getText(findTestObject('null'), 
    0)

Mobile.verifyEqual(g, 'Enter your username')

Mobile.setText(findTestObject('null'), 'pentestu102', 
    0)

WebUI.delay(3)

h = Mobile.getText(findTestObject('null'), 
    0)

Mobile.verifyEqual(h, 'Card/Access Number')

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), '7887889000315720', 
    0)

WebUI.delay(3)

i = Mobile.getText(findTestObject('null'), 0)

Mobile.verifyEqual(i, 'ID Number')

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'P2389982', 
    0)

WebUI.delay(3)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/5.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(15)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 
    'Pass@1247', 0)

WebUI.delay(3)

f = Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(f, 'Show password')

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'Pass@1247', 
    0)

WebUI.delay(3)

e = Mobile.getText(findTestObject('null'), 
    0)

Mobile.verifyEqual(e, 'Between 8-12 characters.')

d = Mobile.getText(findTestObject('null'), 
    0)

Mobile.verifyEqual(d, 'Must include at least 1 uppercase, 1 lowercase, 1 number and 1 special character.')

c = Mobile.getText(findTestObject('null'), 
    0)

Mobile.verifyEqual(c, 'Must not include 3 consecutive characters. (e.g. 123, abc)')

b = Mobile.getText(findTestObject('null'), 
    0)

Mobile.verifyEqual(b, 'Must not be similar to your Maybank2u user ID.')

a = Mobile.getText(findTestObject('null'), 
    0)

Mobile.verifyEqual(a, 'Match Confirm Password.')

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('null'), 'Pass@1247', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

