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
WebUI.openBrowser('https://arcania-integ.astek.mu/Login')

'Navigate to URL: https://arcania-integ.astek.mu/Login'
WebUI.navigateToUrl('https://arcania-integ.astek.mu/Login')

'Enter username'
WebUI.setText(findTestObject('Page_Arcania - Log In/input_Username'), 'b1@arc.com')

'Enter Password'
WebUI.setEncryptedText(findTestObject('Page_Arcania - Log In/input_Password'), 'nYgPIvXAGJo=')

WebUI.click(findTestObject(null))

'Click on SignIn Button '
WebUI.click(findTestObject('Page_Arcania - Log In/SignIn'))

WebUI.waitForPageLoad(2)

WebUI.waitForElementPresent(findTestObject('Page_Arcania - Dashboard/h1_Dashboard'), 0)

'Click on Icon Leads button '
WebUI.click(findTestObject('Page_Arcania - Dashboard/i_icon-leads'))

'Click on Agent Lead Tab'
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/AgentLead_tab'))

'Click on Create Lead button '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/CreateLead_button'))

'Click on Agent Name Drop Down'
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/AgentName_DropDown'))

'Select "Indian Oil" on Agent Name Drop Down'
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/IndianOil_DropDownLabel'))

'Click on Contact Person Drop Down '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/ContactPerson_DropDown'))

'Select "Yuna Mohit" on Contact Person Drop Down'
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/ContactPerson_DropDownLabel'))

'Click on radio button "Origin Service"'
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/OriginService_radiobutton'))

'Click on AIR Button to select'
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/AIR_LABEL'))

'Click on SEA Button to unselect'
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/SEA_LABEL'))

'Click on Door Origin button '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/DOORORIGIN_button'))

'Enter Street name'
WebUI.setText(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/Street_textarea'), 'asd')

'Click on Country Drop Down'
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/Country_DropDown'))

'Click on Albania to select from Country Drop Down'
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/Albania_DropDownLabel'))

'Input a name for City in text area'
WebUI.setText(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/City_textarea'), 'sds')

'Input a value for ZIP code'
WebUI.setText(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/ZipCode_textarea'), '123')

'Click on Warehouse Origin Button '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/WAREHOUSEORIGIN_button'))

'Click on Country Drop Down '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/Warehouse_Country_DropDown'))

'Click on Scroll Down Button '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/WarehouseCountryDropDown_ScrollDownButton'))

'Select France from Country Drop Down '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/France_DropDownLabel_forWarehouse'))

'Click on Choose Branch Drop Down '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/WarehouseBranchDropDown'))

'Select "360 Relocations" from Choose Branch Drop Down '
WebUI.click(findTestObject('null'))

'Click on Volume/Weight Drop Down '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/VolumeWeight_DropDown'))

'Select "CFT" on drop down '
WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/CFT_VolumeWeight_DropDownLabel'))

'Add value "123" to option 1 text area'
WebUI.setText(findTestObject('Object Repository/input_TransportSectionList0.Op'), '123')

'Click on "+" icon '
WebUI.click(findTestObject('null'))

'Select date from Calendar 1'
WebUI.click(findTestObject('null'))

'Click on "Type of Container" Drop Down'
WebUI.click(findTestObject('null'))

'Select value "20" from Drop Down '
WebUI.click(findTestObject('null'))

'Click on Calendar 1 icon '
WebUI.click(findTestObject('null'))

'Click on Calendar 2 icon '
WebUI.click(findTestObject('null'))

'Select Date from Calendar 2'
WebUI.click(findTestObject('null'))

'Click on Calendar 3 icon '
WebUI.click(findTestObject('null'))

'Select Date from Calendar 3'
WebUI.click(findTestObject('null'))

'Click on Calendar 4 icon '
WebUI.click(findTestObject('null'))

'Select Date from Calendar 4'
WebUI.click(findTestObject('null'))

'Click on Pricing Method Drop Down '
WebUI.click(findTestObject('null'))

'Select "Per CBM" value from Drop Down'
WebUI.click(findTestObject('null'))

'Check RMS: YES'
WebUI.click(findTestObject('Object Repository/label_Yes'))

'Click on button Submit Request'
WebUI.click(findTestObject('Object Repository/button_Submit request (1)'))

'Navigate to "Lead Page" '
WebUI.navigateToUrl('https://arcania-integ.astek.mu/Leads/AgentLeads?qid=6ED7CE004600AF71140512554056140A1A10131BD469DF4153515F58010167D5D8571C18')

'Click on Status Button '
WebUI.click(findTestObject('null'))

'Uncheck "Draft"'
WebUI.click(findTestObject('Object Repository/label_Draft (1)'))

'Uncheck "Not Handled"'
WebUI.click(findTestObject('Object Repository/label_Not Handled'))

'Uncheck Pending PMS'
WebUI.click(findTestObject('Object Repository/label_Pending PMS (1)'))

'Uncheck Pending'
WebUI.click(findTestObject('Object Repository/label_Pending'))

'Click on Apply Button '
WebUI.click(findTestObject('Object Repository/button_Apply'))

