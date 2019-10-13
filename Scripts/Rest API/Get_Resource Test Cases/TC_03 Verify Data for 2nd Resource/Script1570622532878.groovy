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

response = WS.sendRequest(findTestObject('Object Repository/API_OR/Resource List Page_01'))

'Verify 1st resource in Response E.g id = 1'
WS.verifyElementPropertyValue(response,'data[0].id', 1)


'Verify 1st resource in Response E.g name = cerulean'
WS.verifyElementPropertyValue(response,'data[0].name', 'cerulean')


'Verify 1st resource in Response E.g year = 2000'
WS.verifyElementPropertyValue(response,'data[0].year', 2000)


'Verify 1st resource in Response E.g color = #98B2D1'
WS.verifyElementPropertyValue(response,'data[0].color', '#98B2D1')


'Verify 1st resource in Response E.g pantone_value = 15-4020'
WS.verifyElementPropertyValue(response,'data[0].pantone_value', '15-4020')


