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

response = WS.sendRequest(findTestObject('API_OR/Create User'))

WS.verifyResponseStatusCode(response, 201)

WS.verifyElementPropertyValue(response, 'id', GlobalVariable.nid)

WS.verifyElementPropertyValue(response, 'author', GlobalVariable.nia+GlobalVariable.nid)

WS.verifyElementPropertyValue(response, 'title', GlobalVariable.nit+GlobalVariable.nid)

WS.verifyElementPropertyValue(response, 'email', GlobalVariable.nie)

//object res1 = WS.sendRequest(findTestObject('API_OR/Create User'))

response1 = WS.sendRequest(findTestObject('Object Repository/API_OR/Get_Post'))

WS.verifyElementPropertyValue(response1, '[0].id', GlobalVariable.nid)

WS.verifyElementPropertyValue(response1, '[0].author', GlobalVariable.nia+GlobalVariable.nid)

WS.verifyElementPropertyValue(response1, '[0].title', GlobalVariable.nit+GlobalVariable.nid)

WS.verifyElementPropertyValue(response1, '[0].email', GlobalVariable.nie)