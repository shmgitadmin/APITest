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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.techlistic.com/p/selenium-practice-form.html')

WebUI.waitForPageLoad(5)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('TC_Record_01_OR/Page_Selenium Practice Form/a_TestNG Integration'), 'TestNG Integration')

WebUI.verifyTextPresent('First name', false)

WebUI.verifyTextPresent('Last', false)

WebUI.verifyTextPresent('Gender', false)

WebUI.verifyTextPresent('Years of Experience', false)

WebUI.setText(findTestObject('TC_Record_01_OR/input_First name_firstname'), 'Suhaib')

WebUI.setText(findTestObject('TC_Record_01_OR/input_Last name_lastname'), 'Malik')

WebUI.click(findTestObject('TC_Record_01_OR/input_Gender_sex'))

WebUI.click(findTestObject('TC_Record_01_OR/input_Years of Experience_exp'))

WebUI.setText(findTestObject('TC_Record_01_OR/input_Date_datepicker'), '24-Aug-2000')

WebUI.click(findTestObject('TC_Record_01_OR/input_Profession_profession'))

WebUI.click(findTestObject('TC_Record_01_OR/input_Automation Tools_tool'))

WebUI.click(findTestObject('TC_Record_01_OR/input_Automation Tools_tool_1'))

WebUI.selectOptionByValue(findTestObject('TC_Record_01_OR/select_Browser CommandsNavigation CommandsSwitch CommandsWait CommandsWebElement Commands'), 
    'Browser Commands', true)

WebUI.selectOptionByValue(findTestObject('TC_Record_01_OR/select_Browser CommandsNavigation CommandsSwitch CommandsWait CommandsWebElement Commands'), 
    'Navigation Commands', true)

WebUI.selectOptionByValue(findTestObject('TC_Record_01_OR/select_Browser CommandsNavigation CommandsSwitch CommandsWait CommandsWebElement Commands'), 
    'Navigation Commands', true)

WebUI.click(findTestObject('TC_Record_01_OR/button_Button'))

WebUI.closeBrowser()

