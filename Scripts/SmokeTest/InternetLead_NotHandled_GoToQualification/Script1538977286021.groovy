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

WebUI.openBrowser('https://arcania-integ.astek.mu/Leads/InternetLeads?qid=6ED7CE004600AF71140512554056140A1A100E6B86339B1642200607455064D1DB531F19DD0B0A04025C55560A0F0010')

WebUI.navigateToUrl('https://arcania-integ.astek.mu/Leads/InternetLeads?qid=6ED7CE004600AF71140512554056140A1A100E6B86339B1642200607455064D1DB531F19DD0B0A04025C55560A0F0010')

'Click on not_handled '
WebUI.click(findTestObject('Object Repository/InternetLead/NotHandled_GoToQualification_StatusNotHandled/div_Not Handled'))

'Click on Go To Qualification'
WebUI.click(findTestObject('InternetLead/NotHandled_GoToQualification_StatusNotHandled/GoToQualification_button'))

'Click on Next-PMS'
WebUI.click(findTestObject('InternetLead/NotHandled_GoToQualification_StatusNotHandled/span_PMS'))

'Click on No_button'
WebUI.click(findTestObject('InternetLead/NotHandled_GoToQualification_StatusNotHandled/no_button'))

WebUI.click(findTestObject('Object Repository/InternetLead/NotHandled_GoToQualification_StatusNotHandled/i_icon-leads'))

WebUI.closeBrowser()

