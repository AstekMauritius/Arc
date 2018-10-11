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
import org.openqa.selenium.Keys as Keys

'Open Browser'
WebUI.openBrowser('')

'Navigate to URL '
WebUI.navigateToUrl('https://arcania-integ.astek.mu/Login')

'Enter Username'
WebUI.setText(findTestObject('Object Repository/input_Username'), 'b1@arc.com')

'Enter Password'
WebUI.setEncryptedText(findTestObject('Object Repository/input_Password'), 'nYgPIvXAGJo=')

'Click on Sign In Button '
WebUI.click(findTestObject('Page_Arcania - Log In/SignIn'))

'Click on Icon Lead'
WebUI.click(findTestObject('Object Repository/i_icon-leads'))

'Click on Agent lead tab '
WebUI.click(findTestObject('Page_Arcania - Leads/Title_AgentLeads'))

'Click on Status Button '
WebUI.click(findTestObject('Page_Arcania - Leads/Leads_Status_Button'))

'Click on labe draft to uncheck '
WebUI.click(findTestObject('Object Repository/label_Draft'))

'Click on manual quote label to uncheck '
WebUI.click(findTestObject('Object Repository/label_Manual quote to be follo'))

'Click on pending PMS label to uncheck '
WebUI.click(findTestObject('Object Repository/label_Pending PMS'))

'Click on Apply button'
WebUI.click(findTestObject('Page_Arcania - Leads/button_Apply'))

'Click on awaiting quote in status column '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/div_awaitingQuote'))

'Click on request more info button '
WebUI.click(findTestObject('Page_Arcania - Leads/RequestMoreInfo_button'))

'Comment "Good" on textarea'
WebUI.setText(findTestObject('null'), 'good')

'Click on icon "send" '
WebUI.click(findTestObject('Object Repository/i_icon-send-mail'))

'Click on Dialog Close button '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/Request more info dialog close button'))

