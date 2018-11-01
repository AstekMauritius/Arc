import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://arcania-integ.astek.mu/Login')

WebUI.navigateToUrl('https://arcania-integ.astek.mu/Login')

WebUI.setText(findTestObject('Object Repository/Testing/input_Sign into your account_U'), 'b1@arc.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Testing/input_Username_Password'), 'nYgPIvXAGJo=')

WebUI.click(findTestObject('Object Repository/Testing/span_Sign in_mdl-button__rippl'))

'Click on Lead icon'
WebUI.click(findTestObject('Object Repository/Testing/i_Corporate_unhandledLeadsBadg'))

WebUI.click(findTestObject('Object Repository/Testing/div_To be followed-up'))

WebUI.click(findTestObject('Object Repository/Testing/span_Abandon_mdl-button__rippl'))

WebUI.click(findTestObject('Object Repository/Testing/div_Abandon'))

WebUI.click(findTestObject('Object Repository/Testing/label_Duplicate'))

WebUI.click(findTestObject('Object Repository/Testing/button_Submit'))

