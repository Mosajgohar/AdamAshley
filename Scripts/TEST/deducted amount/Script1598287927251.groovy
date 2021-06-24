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

'app launch (peileng) (UAT_test06)'
Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 0)

WebUI.delay(3)

Mobile.swipe(500, 1500, 500, 900)

Mobile.getText(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

String trx1 = Mobile.getText(findTestObject('null'), 
    0).substring(4)

System.out.println(trx1)

not_run: println(trx1.substring(4))

String trx11 = trx1.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx11)

int trx111 = ((trx11) as Integer)

System.out.println(trx111)

Mobile.getText(findTestObject('null'), 
    0)

String trx2 = Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 
    0)

not_run: trx2 = Mobile.getText(findTestObject('null'), 
    0)

not_run: trx2 = Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

not_run: Mobile.getText(findTestObject('null'), 
    0)

not_run: trx3 = Mobile.getText(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('null'), 0)

Mobile.getText(findTestObject('null'), 
    0)

Mobile.getText(findTestObject('null'), 0)

String trxT1 = Mobile.getText(findTestObject('null'), 
    0).substring(4)

String trxT11 = trxT1.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trxT11)

int trxT111 = ((trxT11) as Integer)

System.out.println(trxT111)

Mobile.getText(findTestObject('null'), 0)

String trx4 = Mobile.getText(findTestObject('null'), 
    0).substring(4)

String trx41 = trx4.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx41)

int trx411 = ((trx41) as Integer)

System.out.println(trx411)

Mobile.getText(findTestObject('null'), 0)

String trx5 = Mobile.getText(findTestObject('null'), 
    0).substring(4)

String trx51 = trx5.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx51)

int trx511 = ((trx51) as Integer)

System.out.println(trx511)

Mobile.getText(findTestObject('null'), 0)

String trx6 = Mobile.getText(findTestObject('null'), 
    0).substring(4)

String trx61 = trx6.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx61)

int trx611 = ((trx61) as Integer)

System.out.println(trx611)

int value = (trx411 + trx511) + trx611

System.out.println(value)

if (value == trxT111) {
    System.out.println('INDIVIDUAL expenses is EQUAL to TOTAL expenses')
} else {
    System.out.println('INDIVIDUAL expenses is NOT EQUAL to TOTAL expenses')
}

int value2 = trx411 + trx511

System.out.println(value2)

if (value2 == trxT111) {
    System.out.println('INDIVIDUAL expenses is EQUAL to TOTAL expenses')
} else {
    System.out.println('INDIVIDUAL expenses is NOT EQUAL to TOTAL expenses')
}

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/deducted amount/1.png', FailureHandling.CONTINUE_ON_FAILURE)

