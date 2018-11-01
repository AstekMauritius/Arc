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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

WebUI.openBrowser('')

WebUI.navigateToUrl('https://arcania-integ.astek.mu/Login')

WebUI.setText(findTestObject('MainFolder/Login/input_Username'), 'b1@arc.com')

WebUI.setEncryptedText(findTestObject('MainFolder/Login/input_Password'), 'JVU6vGYNcKE=')

WebUI.click(findTestObject('MainFolder/Login/SignIn'))

WebUI.click(findTestObject('MainFolder/Dashboard/LeftMenu/LeadsBadge'))

WebUI.click(findTestObject('MainFolder/Leads/Tab/Tab_Agent Leads'))

WebUI.click(findTestObject('MainFolder/Leads/button_Create Lead'))

WebUI.click(findTestObject('MainFolder/General/Agent Leads - Create New Rate Request/General Information/DropDown_Agent Name'))

WebUI.click(findTestObject('AgentLead_CreateLead_NotHandled/li_Microsoft'))

WebUI.click(findTestObject('MainFolder/General/Agent Leads - Create New Rate Request/General Information/DropDown_Contact Person'))

WebUI.click(findTestObject('AgentLead_CreateLead_NotHandled/li_Tom Hilly'))

WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/label_Full service'))

WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/label_Yes'))

WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/i_icon-arrow-right'))

WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_QuoteModelSea.Oprational'))

WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/span_QuoteModelSea_OprationalA'))

WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/li_Albania'))

WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_QuoteModelSea.Oprational_1'), 'a')

WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_QuoteModelSea.Oprational_2'), '1234')

WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_QuoteModelSea.Oprational_3'))

WebUI.click(findTestObject('AgentLead_CreateLead_NotHandled/DropDown_DoorDestinationCountry'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AgentLead_CreateLead_NotHandled/antar'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_QuoteModelSea.Oprational_5'), '1234')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_QuoteModelSea.Oprational_4'), 'a')

WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/i_icon-arrow-right_1'))

WebUI.delay(3)

WebUI.click(findTestObject('AgentLead_CreateLead_NotHandled/span_mCFTKGLBS'))

WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/li_KG'))

WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_TransportSectionList0.Op'), '12')

WebUI.scrollToElement(findTestObject('AgentLead_CreateLead_NotHandled/CalenderExpected1'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('AgentLead_CreateLead_NotHandled/CalenderExpected1'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/td_24'))

not_run: WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/span_e-icon e-calendar_1'))

not_run: WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/td_31'))

not_run: WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/label_Mr'))

not_run: WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_ShipperContact.Name'), 'Paul')

not_run: WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_ShipperContact.Surname'), 
    'Smith')

not_run: WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_ShipperContact.Email'), 'PSmith@gmail.com')

not_run: WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_ShipperContact.MobileNum'), 
    '+1 111')

not_run: WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_ShipperContact.MobileNum_1'), 
    '+1 1111')

not_run: WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_ShipperContact.MobileNum_2'), 
    '+1 11111')

not_run: WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_ShipperContact.MobileNum_3'), 
    '+1 111111')

not_run: WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_ShipperContact.MobileNum_4'), 
    '+1 1111111')

not_run: WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_ShipperContact.MobileNum_5'), 
    '+1 11111111')

not_run: WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_ShipperContact.MobileNum_6'), 
    '+1 111111111')

not_run: WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_ShipperContact.MobileNum_7'), 
    '+1 1111111111')

not_run: WebUI.setText(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/input_ShipperContact.MobileNum_8'), 
    '+1 111-111-1111')

not_run: WebUI.click(findTestObject('Object Repository/AgentLead_CreateLead_NotHandled/i_icon-arrow-right_2'))

