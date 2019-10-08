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

WebUI.navigateToUrl('https://qaroam2.roamworks.com/engineersoffice/caesar/?#!/login')

WebUI.setText(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Login ROAM/input_Login_username'), 'shmcustadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Login ROAM/input_Login_password'), 
    'hPF9GPDH1LwgyyJeBVhhKQ==')

WebUI.sendKeys(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Login ROAM/input_Login_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Engineers Office ROAM/span_Towing Alarm_icon-collapse'))

WebUI.click(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Engineers Office ROAM/span_Auto Group'))

WebUI.rightClick(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Auto Group ROAM/span_Auto Group'))

WebUI.click(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Auto Group ROAM/span_Add CANBUS Fleet Vehicle'))

WebUI.click(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Auto Group ROAM/span_Motorcycle'))

WebUI.click(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Auto Group ROAM/li_Heavy Bus'))

WebUI.click(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Auto Group ROAM/span_select'))

WebUI.click(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Auto Group ROAM/a_30'))

WebUI.setText(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Auto Group ROAM/input_Name_name'), 'ssdsds')

WebUI.click(findTestObject('Object Repository/EO QA Objects/Recorder/Page_Auto Group ROAM/button_Add CANBUS Fleet Vehicle'))

WebUI.closeBrowser()

