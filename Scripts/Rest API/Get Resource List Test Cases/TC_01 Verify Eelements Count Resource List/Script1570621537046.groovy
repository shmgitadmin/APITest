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

'Verify Response Status Code'
WS.verifyResponseStatusCode(response,200)

'Verify Page = 1 is there in response'
WS.verifyElementPropertyValue(response,'page',1)

'Verify Per Page = 6 is there in response'
WS.verifyElementPropertyValue(response,'per_page',6)


'Verify Total Pages = 12 is there in response'
WS.verifyElementPropertyValue(response,'total',12)

'Verify Response has 6 Records'
WS.verifyElementsCount(response, 'data',6)

'Verify 1st Record has 4 Elements'
WS.verifyElementsCount(response,'data[0]',5)

'Verify 2nd Record has 4 Elements'
WS.verifyElementsCount(response,'data[1]',5)

'Verify 3rd Record has 4 Elements'
WS.verifyElementsCount(response,'data[2]',5)

'Verify 4th Record has 4 Elements'
WS.verifyElementsCount(response,'data[3]',5)

'Verify 5th Record has 4 Elements'
WS.verifyElementsCount(response,'data[4]',5)

'Verify 6th Record has 4 Elements'
WS.verifyElementsCount(response,'data[5]',5)









