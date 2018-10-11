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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/PrivateLead - CreateLead/Page_Arcania - Log In/input_Username'), 'b1@arc.com')

WebUI.setEncryptedText(findTestObject('Object Repository/PrivateLead - CreateLead/Page_Arcania - Log In/input_Password'), 
    'nYgPIvXAGJo=')

WebUI.click(findTestObject('Page_Arcania - Log In/SignIn'))

WebUI.click(findTestObject('PrivateLead - CreateLead/Page_Arcania - Dashboard/a_Leads'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PrivateLead_Transfer/Page_Arcania - Leads/PrivateLeadTab'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Private lead/Page_Arcania - Leads/Create Lead Button'))

WebUI.waitForPageLoad(5)

WebUI.delay(3)

WebUI.click(findTestObject('PrivateLead - CreateLead/Page_Arcania - Lead Information/label_Mr'))

WebUI.setText(findTestObject('Object Repository/PrivateLead - CreateLead/Page_Arcania - Lead Information/input_Name'), 'Ashish')

WebUI.setText(findTestObject('Object Repository/PrivateLead - CreateLead/Page_Arcania - Lead Information/input_Surname'), 
    'Patyyah')

WebUI.setText(findTestObject('Object Repository/PrivateLead - CreateLead/Page_Arcania - Lead Information/input_Email'), 
    'apattyyah@arc.com')

WebUI.setText(findTestObject('Object Repository/PrivateLead - CreateLead/Page_Arcania - Lead Information/input_MobileNumber'), 
    '+1123')

WebUI.setText(findTestObject('Object Repository/PrivateLead - CreateLead/Page_Arcania - Lead Information/input_MobileNumber_1'), 
    '+1 1234')

WebUI.setText(findTestObject('Object Repository/PrivateLead - CreateLead/Page_Arcania - Lead Information/input_MobileNumber_2'), 
    '+1 12341')

WebUI.click(findTestObject('Object Repository/PrivateLead - CreateLead/Page_Arcania - Lead Information/span_Nationality_dropdown'))

WebUI.click(findTestObject('Object Repository/PrivateLead - CreateLead/Page_Arcania - Lead Information/span_Mauritian'))

WebUI.click(findTestObject('PrivateLead - CreateLead/Page_Arcania - Lead Information/NextBtn'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('PrivateLead - CreateLead/Page_Arcania - ClientDisambiguation/1Customer'))

WebUI.click(findTestObject('PrivateLead - CreateLead/Page_Arcania - ClientDisambiguation/button_Confirm'))

WebUI.click(findTestObject('PrivateLead - CreateLead/Page_Arcania - Lead Qualification/CountryDropDown'))

WebUI.click(findTestObject('Object Repository/PrivateLead - CreateLead/Page_Arcania - LeadQualification/span_Afghanistan'))

WebUI.setText(findTestObject('Object Repository/PrivateLead - CreateLead/Page_Arcania - LeadQualification/input_OriginAddress.City'), 
    'Asadabad, Afghanistan')

WebUI.click(findTestObject('PrivateLead - CreateLead/Page_Arcania - Lead Qualification/2dropDownCountry'))

WebUI.delay(3)

WebUI.click(findTestObject('PrivateLead - CreateLead/Page_Arcania - Lead Qualification/li_land Islands'))

