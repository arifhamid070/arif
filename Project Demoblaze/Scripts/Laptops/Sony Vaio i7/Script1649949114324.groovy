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

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/input_Username_loginusername'), 'Ahmad1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/input_Password_loginpassword'), 
    'hNEBwlQiQdG7Jnsv5GN2Cw==')

WebUI.click(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/button_Log in'))

WebUI.click(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/a_Laptops'))

WebUI.click(findTestObject('Laptops/Sony Vaio i7/Page_STORE/a_Sony vaio i7'))

WebUI.click(findTestObject('Laptops/Sony Vaio i7/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/input_Name_name'), 'Ahmad')

WebUI.setText(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/input_Country_country'), 'Malaysia')

WebUI.setText(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/input_City_city'), 'Shah Alam')

WebUI.setText(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/input_Credit card_card'), '1234')

WebUI.setText(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/input_Month_month'), '12')

WebUI.setText(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/input_Year_year'), '2022')

WebUI.click(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/button_Purchase'))

WebUI.click(findTestObject('Object Repository/Laptops/Sony Vaio i5/Page_STORE/button_OK'))

WebUI.closeBrowser()

