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

WebUI.setText(findTestObject('Object Repository/PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Log In/input_Username'), 
    'b1@arc.com')

WebUI.setEncryptedText(findTestObject('Object Repository/PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Log In/input_Password'), 
    'nYgPIvXAGJo=')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Arcania - Log In/SignIn'))

WebUI.click(findTestObject('PrivateLead_Transfer/Page_Arcania - Dashboard/i_icon-leads'))

WebUI.click(findTestObject('PrivateLead_Transfer/Page_Arcania - Leads/PrivateLeadTab'))

WebUI.click(findTestObject('PrivateLead_Transfer/Page_Arcania - Leads/div_Not Handled'))

WebUI.click(findTestObject('PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Lead Detail/Follow-UpOption'))

WebUI.click(findTestObject('PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Lead Detail/div_e-icon e-navigatenext'))

WebUI.waitForElementClickable(findTestObject('PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Lead Detail/td_e-workcells e-alternatecell'), 
    5)

WebUI.click(findTestObject('PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Lead Detail/td_e-workcells e-alternatecell'))

WebUI.setText(findTestObject('Object Repository/PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Lead Detail/textarea_Description'), 
    'Test Hello')

WebUI.click(findTestObject('Object Repository/PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Lead Detail/span_mdl-button__ripple-contai_1'))

WebUI.click(findTestObject('Object Repository/PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Lead Detail/span_mdl-button__ripple-contai_2'))

WebUI.click(findTestObject('Object Repository/PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Lead Detail/span_mdl-button__ripple-contai_3'))

WebUI.click(findTestObject('Object Repository/PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Leads/span_mdl-button__ripple-contai_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Leads/label_Awaiting quote'))

WebUI.click(findTestObject('Object Repository/PrivateLead-NotHandled-Follow-UpToAwaitingQuote/Page_Arcania - Leads/button_Apply'))

