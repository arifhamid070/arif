package demoblaze
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginStep {
	
	@Given("User navigate to login page")
	def navigateToLoginPage() {
		println ("I am at Login")
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://www.demoblaze.com/')
		
	}

	@When("User enter (.*) and (.*)")
	def enterCredentials(String username, String password) {
		println ("Input Credentials")
		println ("Username :"+username)
		println ("Password :"+password)
		WebUI.click(findTestObject('Object Repository/Page_STORE/a_Log in'))
		
		WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Username_loginusername'), username)
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/input_Password_loginpassword'), password)
		
	}
	
	@And("Click login button")
	def clickLogin() {
		println ("Click the login button")
		WebUI.click(findTestObject('Object Repository/Page_STORE/button_Log in'))
		
	}
	
	@Then("Navigated to Homepage")
	def verifyHomePage() {
		println ("I am in")
		WebUI.verifyElementPresent(findTestObject('Page_STORE/a_Welcome Ahmad1234'), 5)
		WebUI.closeBrowser()
	}
}