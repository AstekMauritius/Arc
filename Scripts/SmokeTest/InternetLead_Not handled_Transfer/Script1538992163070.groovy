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

WebUI.setText(findTestObject('Object Repository/InternetLead_Not handled_Transfer/input_Username'), 'b1@arc.com')

WebUI.setEncryptedText(findTestObject('Object Repository/InternetLead_Not handled_Transfer/input_Password'), 'nYgPIvXAGJo=')

WebUI.click(findTestObject('Page_Arcania - Log In/SignIn'))

WebUI.click(findTestObject('Object Repository/InternetLead_Not handled_Transfer/i_unhandledLeadsBadge'))

WebUI.click(findTestObject('Object Repository/InternetLead_Not handled_Transfer/span_mdl-button__ripple-contai (1)'))

WebUI.click(findTestObject('Object Repository/InternetLead_Not handled_Transfer/span_mdl-button__ripple-contai_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/InternetLead_Not handled_Transfer/button_Apply'))

WebUI.delay(3)

WebUI.click(findTestObject('InternetLead_Not handled_Transfer/div_Not Handled'))

WebUI.click(findTestObject('Object Repository/InternetLead_Not handled_Transfer/span_mdl-button__ripple-contai (2)'))

WebUI.delay(3)

WebUI.click(findTestObject('InternetLead_Not handled_Transfer/label_AGS Aruba'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/InternetLead_Not handled_Transfer/button_Submit'))

WebUI.click(findTestObject('Object Repository/InternetLead_Not handled_Transfer/span_mdl-button__ripple-contai_1'))

WebUI.click(findTestObject('Object Repository/InternetLead_Not handled_Transfer/label_Transferred'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/InternetLead_Not handled_Transfer/button_Apply'))

