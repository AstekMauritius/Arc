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

'Click on Status button '
WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/Status_button'))

WebUI.scrollToElement(findTestObject('Private lead/ToBeFollowedUp-Abandon/label_Awaiting quote'), 0)

'Select Awaiting Quote label '
WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/label_Awaiting quote'))

WebUI.scrollToElement(findTestObject('Private lead/ToBeFollowedUp-Abandon/label_Draft'), 0)

WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/label_Draft'))

WebUI.scrollToElement(findTestObject('Private lead/ToBeFollowedUp-Abandon/label_Not Handled'), 0)

WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/label_Not Handled'))

WebUI.scrollToElement(findTestObject('Private lead/ToBeFollowedUp-Abandon/label_Pending'), 0)

WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/label_Pending'))

WebUI.scrollToElement(findTestObject('Private lead/ToBeFollowedUp-Abandon/button_Apply'), 0)

'Click on apply button '
WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/button_Apply'))

'Click on not handled'
WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/AwaitingQuotecell_status'))

'Click on abandon button'
WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/Abandon_button'))

'Click on reason '
WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/label_Client could not be reac'))

'Click on submit button '
WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/button_Submit'))

'Click on status button '
WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/Status_button'))

'Click on abandon label'
WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/label_Abandonned'))

'Click on apply button '
WebUI.click(findTestObject('Private lead/ToBeFollowedUp-Abandon/button_Apply'))

WebUI.closeBrowser()

