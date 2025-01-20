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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://orangehrmlive.com/')

WebUI.click(findTestObject('Object Repository/Page_Human Resources Management Software  O_31d1a1/button_Book a Free Demo'))

WebUI.setText(findTestObject('Object Repository/Page_Book Your Free Demo  OrangeHRM/input_Full Name_FullName'), 'Neha')

WebUI.setText(findTestObject('Object Repository/Page_Book Your Free Demo  OrangeHRM/input_Phone Number_Contact'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_Book Your Free Demo  OrangeHRM/input_Email_Email'), 'nehabac@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Book Your Free Demo  OrangeHRM/input_Company Name_CompanyName'), 'Neha')

WebUI.click(findTestObject('Object Repository/Page_Book Your Free Demo  OrangeHRM/input_No Of Employees_action_submitForm'))

WebUI.click(findTestObject('Object Repository/Page_Book Your Free Demo  OrangeHRM/div_We Just Need a Few Details.            _748e3f'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Book Your Free Demo  OrangeHRM/h4_We Just Need a Few Details'), 
    'We Just Need a Few Details.')

WebUI.closeBrowser()

