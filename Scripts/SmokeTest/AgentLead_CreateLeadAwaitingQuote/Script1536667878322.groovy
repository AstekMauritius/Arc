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

'Add username'
WebUI.setText(findTestObject('Page_Arcania - Log In/input_Username'), 'b1@arc.com')

'Add password'
WebUI.setEncryptedText(findTestObject('Page_Arcania - Log In/input_Password'), 'nYgPIvXAGJo=')

'Click on Sign In Button '
WebUI.click(findTestObject('Page_Arcania - Log In/SignIn'))

'Click on Icon Lead button '
WebUI.click(findTestObject('Page_Arcania - Dashboard/i_icon-leads'))

'Click on Agent lead tab'
WebUI.click(findTestObject('Page_Arcania - Leads/Title_AgentLeads'))

'Wait for status button to become visible '
WebUI.waitForElementVisible(findTestObject('Page_Arcania - Leads/Leads_Status_Button'), 0)

'Wait for status button to become clickable'
WebUI.waitForElementClickable(findTestObject('Page_Arcania - Leads/Leads_Status_Button'), 0)

'Click on Status button '
WebUI.click(findTestObject('Page_Arcania - Leads/Leads_Status_Button'))

'Click on draft label to uncheck '
WebUI.click(findTestObject('Page_Arcania - Leads/label_Draft'))

'Click on manual quote label to uncheck '
WebUI.click(findTestObject('Page_Arcania - Leads/label_Manual quote to be follo'))

'Click on pending_pms label '
WebUI.click(findTestObject('Page_Arcania - Leads/label_Pending PMS'))

'Click on apply button'
WebUI.click(findTestObject('Page_Arcania - Leads/button_Apply'))

'Click on create lead button '
WebUI.click(findTestObject('Page_Arcania - Leads/CreateLead_button'))

'Select Astek Mauritius from Drop Down '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/span_Astek Mauritius Ltd'))

'Select Vincent Astek from Drop down '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/span_Vincent Astek'))

'Select radio button origin service'
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/label_Origin service'))

'Select Road to check '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/label_ROAD'))

'Select SEA to uncheck '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/label_SEA'))

WebUI.click(findTestObject('Page_Arcania - Leads/Agent_Create new lead awaiting quote/radio_WarehouseOrigin'))

WebUI.click(findTestObject('Page_Arcania - Leads/Agent_Create new lead awaiting quote/Dropdown_Warehouse_country'))

