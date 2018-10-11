import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://arcania-integ.astek.mu/Login')

WebUI.setText(findTestObject('InternetLead_NotHandled_Follow_Up_StatusAwaitingQuote/input_Username'), 'b1@arc.com')

WebUI.setEncryptedText(findTestObject('InternetLead_NotHandled_Follow_Up_StatusAwaitingQuote/input_Password'), 'nYgPIvXAGJo=')

WebUI.click(findTestObject('Page_Arcania - Log In/SignIn'))

WebUI.click(findTestObject('InternetLead_NotHandled_Follow_Up_StatusAwaitingQuote/i_unhandledLeadsBadge'))

WebUI.click(findTestObject('InternetLead_NotHandled_Follow_Up_StatusAwaitingQuote/button_Status'))

WebUI.delay(3)

WebUI.click(findTestObject('InternetLead_NotHandled_Follow_Up_StatusAwaitingQuote/label_Awaiting quote'))

WebUI.click(findTestObject('InternetLead_NotHandled_Follow_Up_StatusAwaitingQuote/button_Apply'))

WebUI.click(findTestObject('PrivateLead_AwaitingQuote_Transfer/div_Awaiting quote'))

WebUI.click(findTestObject('InternetLead_NotHandled_Follow_Up_StatusAwaitingQuote/span_mdl-button__ripple-contai (1)'))

WebUI.doubleClick(findTestObject('InternetLead_NotHandled_Follow_Up_StatusAwaitingQuote/div_All Day'))

WebUI.delay(3)

WebUI.click(findTestObject('InternetLead_NotHandled_Follow_Up_StatusAwaitingQuote/button_Close'))

WebUI.delay(3)

WebUI.click(findTestObject('InternetLead_NotHandled_Follow_Up_StatusAwaitingQuote/button_BackToList'))

