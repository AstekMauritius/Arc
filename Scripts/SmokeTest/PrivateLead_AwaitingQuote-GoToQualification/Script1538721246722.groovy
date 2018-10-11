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

WebUI.openBrowser('https://arcania-integ.astek.mu/Leads/PrivateLeads?qid=6ED7CE004600AF71140512554056140A1A100E6B86339B1642200607455064D1DB531F19DA070A0000575F53000F0711')

WebUI.navigateToUrl('https://arcania-integ.astek.mu/Leads/PrivateLeads?qid=6ED7CE004600AF71140512554056140A1A100E6B86339B1642200607455064D1DB531F19DA070A0000575F53000F0711')

'Click on Status Button '
WebUI.click(findTestObject('Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/Status_button'))

WebUI.scrollToElement(findTestObject('Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/label_Awaiting quote'), 
    0)

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/label_Awaiting quote'))

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/label_Draft'))

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/label_Not Handled'))

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/label_Pending'))

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/button_Apply'))

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/div_Awaiting quote'))

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/Qualification_button'))

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/span_PMS'))

'Click on No Button'
WebUI.click(findTestObject('Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/no_button'))

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/i_icon-leads'))

'Click on private lead tab'
WebUI.click(findTestObject('Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/privateLead_tab'))

'Click on Status button '
WebUI.click(findTestObject('Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/Status_button'))

WebUI.scrollToElement(findTestObject('Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/label_Awaiting quote'), 
    0)

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/label_Awaiting quote'))

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/label_Draft'))

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/label_Not Handled'))

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/label_Pending'))

WebUI.click(findTestObject('Object Repository/Private lead/AwatingQuote_GoToQualification_StatusAwaitingQuote/button_Apply'))

WebUI.closeBrowser()

