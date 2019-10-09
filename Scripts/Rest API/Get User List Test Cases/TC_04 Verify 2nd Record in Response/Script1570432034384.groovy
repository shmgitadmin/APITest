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

response = WS.sendRequest(findTestObject('API_OR/Users List Page_01'))

'Verifying Id=2'
WS.verifyElementPropertyValue(response, 'data[1].id', 2)

'Verifying Email = janet.weaver@reqres.in'
WS.verifyElementPropertyValue(response, 'data[1].email', 'janet.weaver@reqres.in')

'Verifying First_name =  Janet'
WS.verifyElementPropertyValue(response, 'data[1].first_name', 'Janet')

'Verifying Last_name = Weaver'
WS.verifyElementPropertyValue(response, 'data[1].last_name', 'Weaver')

'Verifying Avatar = https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg'
WS.verifyElementPropertyValue(response, 'data[1].avatar', 'https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg')

