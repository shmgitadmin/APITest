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

response = WS.sendRequest(findTestObject('Object Repository/API_OR/Get Single Resource'))


'Verify single resource in Response E.g id = 10'
WS.verifyElementPropertyValue(response,'data.id', 10)


'Verify single resource in Response E.g name = mimosa'
WS.verifyElementPropertyValue(response,'data.name', 'mimosa')


'Verify single resource in Response E.g year = 2009'
WS.verifyElementPropertyValue(response,'data.year', 209)


'Verify single resource in Response E.g color = #F0C05A'
WS.verifyElementPropertyValue(response,'data.color', '#F0C05A')


'Verify single resource in Response E.g pantone_value = 14-0848'
WS.verifyElementPropertyValue(response,'data.pantone_value', '14-0848')