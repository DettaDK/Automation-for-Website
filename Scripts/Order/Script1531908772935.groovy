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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Page_My Store/a_T-shirts'))

WebUI.click(findTestObject('Object Repository/Page_T-shirts - My Store/a_Faded Short Sleeve T-shirts'))

WebUI.click(findTestObject('Object Repository/Page_Faded Short Sleeve T-shirts -/a_Blue'))

WebUI.click(findTestObject('Object Repository/Page_Faded Short Sleeve T-shirts -/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Faded Short Sleeve T-shirts -/span_Proceed to checkout'))

WebUI.click(findTestObject('Page_Order - My Store/span_Proceed to checkout (2)'))

WebUI.setText(findTestObject('Page_Login - My Store/input_email (1)'), 'sgggtg@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login - My Store/input_passwd (2)'), 'fi/4fvxrkW1Ppv+O1kdRlQ==')

WebUI.click(findTestObject('Page_Login - My Store/button_Sign in (1)'))

WebUI.click(findTestObject('Page_Order - My Store/button_Proceed to checkout (1)'))

WebUI.click(findTestObject('Page_Order - My Store/input_cgv (1)'))

WebUI.click(findTestObject('Page_Order - My Store/button_Proceed to checkout_1 (1)'))

WebUI.click(findTestObject('Page_Order - My Store/a_Pay by check (order processi (1)'))

WebUI.click(findTestObject('Page_My Store/button_I confirm my order (1)'))

