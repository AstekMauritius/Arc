import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
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
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('https://arcania-integ.astek.mu/Login')

WebUI.navigateToUrl('https://arcania-integ.astek.mu/Login')

WebUI.maximizeWindow()

'Insert a valid Login / password and click on Sign in button'
WebUI.setText(findTestObject('Page_Arcania - Log In/input_Username'), 'b1@arc.com')

WebUI.setText(findTestObject('Page_Arcania - Log In/input_Password'), 'b1')

WebUI.click(findTestObject('Page_Arcania - Log In/SignIn'))

WebUI.waitForPageLoad(10)

'The dashboard appear'
WebUI.waitForElementPresent(findTestObject('Page_Arcania - Dashboard/h1_Dashboard'), 0)

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('Page_Arcania - Dashboard/i_icon-leads'))

'Verify Private Client tab'
WebUI.waitForElementPresent(findTestObject('Page_Arcania - Dashboard/Title_PrivateClient'), 0)

'Verify Internets Leads'
WebUI.verifyElementPresent(findTestObject('Page_Arcania - Dashboard/Title_InternetLeads'), 0)

'Verify Agents Leads'
WebUI.verifyElementPresent(findTestObject('Page_Arcania - Dashboard/Title_AgentLeads'), 0)

'Verify leads title is present'
WebUI.verifyTextPresent('LEADS', false)

WebUI.waitForPageLoad(2)

'Click on the private client TAB'
WebUI.click(findTestObject('Page_Arcania - Dashboard/Title_PrivateClient'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('LEADS', false)

WebUI.waitForPageLoad(2)

'Verify Corporate Initiations'
WebUI.verifyElementPresent(findTestObject('Page_Arcania - Dashboard/Title_CorporateInitiations'), 0)

'The private client GRID appear correctly'
WebUI.waitForElementPresent(findTestObject('Page_Arcania - Leads/PrivateClient/PrivateGridList'), 0)

WebUI.click(findTestObject('Page_Arcania - Leads/PrivateClient/CreatePrivateButton'), FailureHandling.STOP_ON_FAILURE)

'Client information page is loaded'
WebUI.waitForElementPresent(findTestObject('Page_Arcania - Leads/PrivateClient/div_Client information'), 0)

WebUI.waitForPageLoad(5)

not_run: WebUI.verifyElementNotChecked(findTestObject('Page_Arcania - Leads/PrivateClient/label_Mr'), 0)

'Checked title:${title}'
WebUI.waitForElementPresent(findTestObject('Page_Arcania - Leads/PrivateClient/label_Mr'), 0)

'Issue to click radio button'
not_run: WebUI.click(findTestObject('Page_Arcania - Leads/PrivateClient/label_Mr'))

'Insert Name:${name}'
WebUI.setText(findTestObject('Page_Arcania - Leads/PrivateClient/input_Name'), varName)

'Insert Surname:${surname}'
WebUI.setText(findTestObject('Page_Arcania - Leads/PrivateClient/input_Surname'), varSurname)

'Insert email:${email}'
WebUI.setText(findTestObject('Page_Arcania - Leads/PrivateClient/input_Email'), varEmail)

not_run: WebUI.click(findTestObject('Page_Arcania - Leads/PrivateClient/FlagSelctionMAU'))

'Insert mobile number:${mobileNumber}'
not_run: WebUI.setText(findTestObject('Page_Arcania - Leads/PrivateClient/input_phone'), varMobileNum)

'Insert nationality:${nationality}'
WebUI.click(findTestObject('Page_Arcania - Leads/PrivateClient/li_British'))

'Click on \'Next\' button and click \'Confirm\' button'
WebUI.click(findTestObject('Page_Arcania - Leads/PrivateClient/NextButton'))

WebUI.click(findTestObject('Page_Arcania - Leads/PrivateClient/ConfirmBtn'))

'Fill in the form for lead qualification as follows:\r\n\r\nSelect type of service:${service}\r\n\r\nMain deptor -Shipper:\r\n\r\nSelect country:${Country}\r\n\r\nInsert City:${city}\r\n\r\nProvider-Shipper:\r\n\r\nSelect country:${Country}\r\n\r\nInsert City:${city}'
WebUI.click(findTestObject('Page_Arcania - Leads/PrivateClient/Page_Arcania - LeadQualification/input_OriginAddress.Steet'))

WebUI.setText(findTestObject('Page_Arcania - Leads/PrivateClient/Page_Arcania - LeadQualification/input_OriginAddress.Steet'), 
    'Mashallah Lane')

WebUI.click(findTestObject('Page_Arcania - Leads/PrivateClient/Page_Arcania - LeadQualification/input_OriginAddress.City'))

WebUI.scrollToElement(findTestObject('Page_Arcania - Leads/PrivateClient/Page_Arcania - LeadQualification/li_Afghanistan'), 
    0)

WebUI.click(findTestObject('Page_Arcania - Leads/PrivateClient/Page_Arcania - LeadQualification/span_LeadDTO_SourceOfTheLeadId'))

WebUI.scrollToElement(findTestObject('Page_Arcania - Leads/PrivateClient/Page_Arcania - LeadQualification/li_Internet Request'), 
    0)

WebUI.click(findTestObject('Page_Arcania - Leads/PrivateClient/Page_Arcania - LeadQualification/span_LeadDTO_CoordinatorId_dro'))

WebUI.scrollToElement(findTestObject('Page_Arcania - Leads/PrivateClient/Page_Arcania - LeadQualification/li_MorisNasseau'), 
    0)

'Click on Next PMS button found on right bottom of the page'
WebUI.click(findTestObject('Page_Arcania - Leads/PrivateClient/Page_Arcania - LeadQualification/PMSButton'))

WebUI.click(findTestObject('Page_Arcania - Log In/Account'))

WebUI.click(findTestObject('Page_Arcania - Log In/Logout'))

WebUI.closeBrowser()

