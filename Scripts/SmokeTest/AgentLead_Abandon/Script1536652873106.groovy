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

WebUI.openBrowser('https://arcania-integ.astek.mu/Login')

WebUI.navigateToUrl('https://arcania-integ.astek.mu/Login')

WebUI.maximizeWindow()

'Insert a valid Login / password and click on Sign in button'
WebUI.setText(findTestObject('Page_Arcania - Log In/input_Username'), 'b1@arc.com')

WebUI.setText(findTestObject('Page_Arcania - Log In/input_Password'), 'b1')

WebUI.click(findTestObject('Page_Arcania - Log In/SignIn'))

WebUI.navigateToUrl('https://arcania-integ.astek.mu/?qid=6ED7CE004600AF71140512554056140A1A10131BD469DF415054515F00026FDFD0561A1E')

WebUI.waitForPageLoad(5)

'The dashboard appear'
WebUI.waitForElementPresent(findTestObject('Page_Arcania - Dashboard/h1_Dashboard'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Arcania - Dashboard/i_icon-leads'), 0)

'Click on the menu lead on the left'
WebUI.click(findTestObject('Page_Arcania - Dashboard/i_icon-leads'))

WebUI.navigateToUrl('https://arcania-integ.astek.mu/Leads/InternetLeads?qid=6ED7CE004600AF71140512554056140A1A10131BD469DF415054515F00026FDFD0561A1E')

WebUI.waitForPageLoad(3)

'The LEADS page appear with the following TAB:\r\n\r\n-Private client\r\n\r\n-Internet leads\r\n\r\n-Agent leads\r\n\r\n-Corporate initiation'
WebUI.verifyElementPresent(findTestObject('Page_Arcania - Leads/Title_PrivateClient'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Arcania - Leads/Title_InternetLeads'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Arcania - Leads/Title_AgentLeads'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Arcania - Leads/Title_CorporateInitiations'), 0)

'The Internet lead GRID appear correctly'
WebUI.click(findTestObject('Page_Arcania - Leads/Title_AgentLeads'))

WebUI.verifyTextPresent('LEADS', false)

WebUI.verifyElementPresent(findTestObject('Page_Arcania - Leads/Agent Leads/AgentLeadsList'), 0)

WebUI.waitForPageLoad(10)

WebUI.verifyElementPresent(findTestObject(null), 0)

WebUI.waitForElementClickable(findTestObject('Page_Arcania - Leads/Leads_Status_Button'), 10)

WebUI.click(findTestObject('Page_Arcania - Leads/Leads_Status_Button'))

WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/AwaitingQuote_Label'))

WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Draft_Label'))

WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/ManualQuote-Label'))

WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Apply_Label'))

WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/div_Pending PMS'))

WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Agent Leads - Detail Page/Abandon_Button'))

WebUI.switchToWindowTitle('Abandon')

WebUI.click(findTestObject('Page_Arcania - Leads/Agent Leads/Abandon popup/Duplicate_Label'))

