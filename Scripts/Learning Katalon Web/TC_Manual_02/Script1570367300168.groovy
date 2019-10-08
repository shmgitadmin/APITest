import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.techlistic.com/p/selenium-practice-form.html')

WebUI.waitForPageLoad(5)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('TC_Manual_02_OR/a_Demo Websites'), 'Demo Websites', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC_Manual_02_OR/input_Automation Tools_tool'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC_Manual_02_OR/input_Profession_profession'))

WebUI.click(findTestObject('TC_Manual_02_OR/option_Browser Commands'))

WebUI.click(findTestObject('TC_Manual_02_OR/option_Navigation Commands'))

WebUI.click(findTestObject('TC_Manual_02_OR/option_Switch Commands'))

WebUI.closeBrowser()

