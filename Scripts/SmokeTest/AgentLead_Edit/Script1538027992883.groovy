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

WebUI.setText(findTestObject('Page_Arcania - Log In/input_Username'), 'b1@arc.com')

WebUI.setEncryptedText(findTestObject('Page_Arcania - Log In/input_Password'), 'nYgPIvXAGJo=')

WebUI.click(findTestObject('Page_Arcania - Log In/SignIn'))

WebUI.click(findTestObject('PrivateLead_Transfer/Page_Arcania - Dashboard/i_icon-leads'))

WebUI.click(findTestObject('Page_Arcania - Leads/span_mdl-button__ripple-contai'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('AgentLead_Edit/Page_Arcania - Leads/div_Pending PMS'))

WebUI.click(findTestObject('AgentLead_Edit/Page_Arcania - AgentLeadsDetail/AgentLead_Editbtn'))

WebUI.click(findTestObject('AgentLead_Edit/Page_Arcania - Leads/EditAgentName'))

WebUI.click(findTestObject('AgentLead_Edit/Page_Arcania - Leads/span_Indian oil'))

WebUI.click(findTestObject('AgentLead_Edit/Page_Arcania - Leads/ContactPersonEdit'))

WebUI.click(findTestObject('Page_Arcania - Leads/span_Next'))

WebUI.click(findTestObject('Page_Arcania - Leads/button_Next'))

WebUI.setText(findTestObject('Page_Arcania - Leads/input_TransportSectionList0.Op'), '5')

WebUI.doubleClick(findTestObject('Page_Arcania - Leads/input_CorporateAccount'))

WebUI.setText(findTestObject('Page_Arcania - Leads/input_CorporateAccount'), '1234')

WebUI.click(findTestObject('AgentLead_Edit/Page_Arcania - Leads/button_Next'))

WebUI.click(findTestObject('AgentLead_Edit/Page_Arcania - Leads/button_Submit request'))

