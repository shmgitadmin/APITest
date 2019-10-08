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

WebUI.openBrowser('https://qaroam2.roamworks.com/engineersoffice/caesar/?#!/login')

WebUI.waitForPageLoad(10)

WebUI.maximizeWindow()

'Entering Valid User Name\r\n'
WebUI.setText(findTestObject('EO QA Objects/Login_Page_OR/input_Login_username'), 'shmcustadmin')

'Entering valid password'
WebUI.setText(findTestObject('EO QA Objects/Login_Page_OR/input_Login_password'), 'puhcc@111')

WebUI.click(findTestObject('EO QA Objects/Login_Page_OR/button_Login'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/EO QA Objects/AssetCanbus_OR/ClickOnGroup'))

WebUI.rightClick(findTestObject('Object Repository/EO QA Objects/AssetCanbus_OR/ClickOnGroup'))

WebUI.click(findTestObject('Object Repository/EO QA Objects/AssetCanbus_OR/span_Add CANBUS Fleet Vehicle'))

WebUI.setText(findTestObject('Object Repository/EO QA Objects/AssetCanbus_OR/input_Name_name'), "Test Auto Canbus")

WebUI.click(findTestObject('Object Repository/EO QA Objects/AssetCanbus_OR/ClickCategory'))

WebUI.click(findTestObject('Object Repository/EO QA Objects/AssetCanbus_OR/Heavy_Vehicle'))

WebUI.click(findTestObject('Object Repository/EO QA Objects/AssetCanbus_OR/License_Category'))

WebUI.click(findTestObject('Object Repository/EO QA Objects/AssetCanbus_OR/License_Cat_Value'))

WebUI.click(findTestObject('Object Repository/EO QA Objects/AssetCanbus_OR/Fuel_Type'))

WebUI.click(findTestObject('Object Repository/EO QA Objects/AssetCanbus_OR/Fuel_type_Value'))

WebUI.setText(findTestObject('Object Repository/EO QA Objects/AssetCanbus_OR/Input_Reg_Exp_Date'), "22/Dec/2019")
























