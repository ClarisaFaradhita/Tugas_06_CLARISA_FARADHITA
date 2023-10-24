import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Positive_Case_Add_To_Card/TC02_Add_To_Card'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Check_Out/Btn_Keranjang'))

WebUI.click(findTestObject('Check_Out/Btn_Check_Out'))

WebUI.setText(findTestObject('Check_Out/First Name'), 'Clarisa')

WebUI.setText(findTestObject('Check_Out/Last Name'), 'Faradhita')

WebUI.setText(findTestObject('Check_Out/Zip Code'), '0098')

WebUI.click(findTestObject('Check_Out/Btn Continue'))

WebUI.click(findTestObject('Check_Out/Btn_Finish'))

WebUI.click(findTestObject('Check_Out/Btn_Back Home'))
