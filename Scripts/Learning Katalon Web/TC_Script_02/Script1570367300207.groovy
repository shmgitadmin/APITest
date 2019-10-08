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

// Note: This is the Test case written using XPATH.
// Open Browser
WebUI.openBrowser('https://www.techlistic.com/p/selenium-practice-form.html')

// Maximize Browser
WebUI.maximizeWindow()

//Type Text in First Name
WebUI.setText(findTestObject('Object Repository/TC_Manual_01_OR/input_First name_firstname'), 'Suhaib')

// Type Text in Last Name
WebUI.setText(findTestObject('Object Repository/TC_Manual_01_OR/input_Last name_lastname'), 'Malik Test')

// Select Gender Radio Button
WebUI.click(findTestObject('Object Repository/TC_Manual_01_OR/input_Gender_sex'))

// Select Years of exp. Radio Button
WebUI.click(findTestObject('Object Repository/TC_Manual_01_OR/input_Years of Experience_exp'))

// Selec Automation Tools: UFT
WebUI.click(findTestObject('Object Repository/TC_Manual_01_OR/input_Automation Tools_tool'))

// Selec Automation Tools: Selenium IDE
WebUI.click(findTestObject('Object Repository/TC_Record_01_OR/input_Automation Tools_tool_1'))

// Click Submit Button
WebUI.click(findTestObject('Object Repository/TC_Manual_01_OR/button_Button'))

// Close Browser

WebUI.closeBrowser()

