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

'Verifying Total Number of Elements under Data Tag.'
WS.verifyElementsCount(response, 'data', 6)

'Verifying Total Number of Elements Data -> 0  Tag.'
WS.verifyElementsCount(response, 'data[0]', 5)

'Verifying Total Number of Elements Data -> 1  Tag.'
WS.verifyElementsCount(response, 'data[1]', 5)

'Verifying Total Number of Elements Data -> 2  Tag.'
WS.verifyElementsCount(response, 'data[2]', 5)

'Verifying Total Number of Elements Data -> 3  Tag.'
WS.verifyElementsCount(response, 'data[3]', 5)

'Verifying Total Number of Elements Data -> 4  Tag.'
WS.verifyElementsCount(response, 'data[4]', 5)

'Verifying Total Number of Elements Data -> 5  Tag.'
WS.verifyElementsCount(response, 'data[5]', 5)

