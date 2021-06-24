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

not_run: Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

not_run: def height = Mobile.getDeviceHeight()

not_run: def width = Mobile.getDeviceWidth()

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: totalBal = Mobile.getText(findTestObject('null'), 0)

def totalBal1 = 'RM 176455.09'

str = totalBal1.replace('RM ', '')

println(str)

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: SavBal = Mobile.getText(findTestObject('null'), 0)

not_run: if ('RM 14,335.68' == 'RM 14,335.68') {
    println('same')
} else {
    println('not same')
}

not_run: if (totalBal == 'RM 14,335.68') {
    println('same')
} else {
    println('not same')
}

not_run: if (totalBal == SavBal) {
    println('same')
} else {
    println('not same')
}

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: MAEBal = Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.swipe(500, 1700, 500, 500)

not_run: WebUI.delay(3)

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: PerBal = Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.getText(findTestObject('null'), 0)

not_run: SaviBal = Mobile.getText(findTestObject('null'), 0)

not_run: Mobile.closeApplication()

