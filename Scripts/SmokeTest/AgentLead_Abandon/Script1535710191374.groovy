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

'Open Browser'
WebUI.openBrowser('https://arcania-integ.astek.mu/Login')

'Navigate to URL: https://arcania-integ.astek.mu/Login'
WebUI.navigateToUrl('https://arcania-integ.astek.mu/Login')

'Maximise Window'
WebUI.maximizeWindow()

'Insert Username'
WebUI.setText(findTestObject('Page_Arcania - Log In/input_Username'), 'b1@arc.com')

'Insert Password'
WebUI.setText(findTestObject('Page_Arcania - Log In/input_Password'), 'b1')

'Click on Sign In Button'
WebUI.click(findTestObject('Page_Arcania - Log In/SignIn'))

'Wait for page load'
WebUI.waitForPageLoad(10)

'The dashboard appear'
WebUI.waitForElementPresent(findTestObject('Page_Arcania - Dashboard/h1_Dashboard'), 0)

'Click on the menu lead on the left'
WebUI.click(findTestObject('Page_Arcania - Dashboard/i_icon-leads'))

'The LEADS page appear with the following TAB:\r\n\r\n-Private client\r\n\r\n-Internet leads\r\n\r\n-Agent leads\r\n\r\n-Corporate initiation'
WebUI.verifyElementPresent(findTestObject('Page_Arcania - Leads/Title_PrivateClient'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Arcania - Leads/Title_InternetLeads'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Arcania - Leads/Title_AgentLeads'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Arcania - Leads/Title_CorporateInitiations'), 0)

WebUI.verifyTextPresent('LEADS', false)

'Click on Agent Lead tab'
WebUI.click(findTestObject('Page_Arcania - Leads/Title_AgentLeads'))

WebUI.verifyElementPresent(findTestObject('Page_Arcania - Leads/Agent Leads/AgentLeadsList'), 0)

'Click on status button'
WebUI.click(findTestObject('Page_Arcania - Leads/InternetLeads/Status_Button'))

'Click on awaiting quote label to uncheck '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/AwaitingQuote_Label'))

'Click on draft label to uncheck '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Draft_Label'))

'Click on not handled label to uncheck '
WebUI.click(findTestObject('Page_Arcania - Leads/InternetLeads/label_Not Handled'))

'Click on pending label to uncheck '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/PendingLabel'))

'Click on pending PMS label'
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/PendingPMS_Label'))

'Click on Pending PMS button in status column '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/div_Pending PMS'))

'Click on Abandon button '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/Abandon_Button'))

'Click on Duplicate label '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Abandon popup/Duplicate_Label'))

