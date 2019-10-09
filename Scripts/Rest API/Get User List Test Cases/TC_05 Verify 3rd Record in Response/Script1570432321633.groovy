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

response = WS.sendRequest(findTestObject('Object Repository/API_OR/Users List Page_01'))

'Verifying Id = 3'
WS.verifyElementPropertyValue(response, 'data[2].id', 3)

'Verifying Email = emma.wong@reqres.in'
WS.verifyElementPropertyValue(response, 'data[2].email', 'emma.wong@reqres.in')

'Verify first_name =  Emma'
WS.verifyElementPropertyValue(response, 'data[2].first_name', 'Emma')

'Verify last_name: Wong'
WS.verifyElementPropertyValue(response, 'data[2].last_name', 'Wong')

'Verify avatar = https://s3.amazonaws.com/uifaces/faces/twitter/olegpogodaev/128.jpg'
WS.verifyElementPropertyValue(response, 'data[2].avatar', 'https://s3.amazonaws.com/uifaces/faces/twitter/olegpogodaev/128.jpg')

WS.verifyElementText(response, 'data[0].email', 'emma.wong@reqres.in')

