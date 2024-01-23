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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/btnMakeAppointment'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/txtUsername'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/txtPassword'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/btnLogin'))

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/ddHealthcareCenter'), 
        1)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/inputApply'))

    if (n == 0) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/inputMedicare'))

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/inputMedicaid'))

        WebUI.delay(1)
    }
    
    if (n == 0) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/inputNone'))

        WebUI.delay(1)
    }
    
    WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/txtVisitDate'), '31/01/2024')

    WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/txtComment'), 'I will Type Something in Here')

    WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/button_Book Appointment'))

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/btnAppointment2'), 
        3)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/btnGotoHomepage'))
}

WebUI.closeBrowser()

