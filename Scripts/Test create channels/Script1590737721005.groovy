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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

// đăng nhập
WebUI.openBrowser('https://hw02-mattermast-webapp-master.herokuapp.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place searchable and accessible anywhere_loginId'), 
    'baophamthien241098@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place searchable and accessible anywhere_password'), 
    'asbcd11782')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

//tạo public channels
WebUI.click(findTestObject('Object Repository/Home_page Mattermost/Page_Town Square - Test team Mattermost/Test-teamButton'))

WebUI.click(findTestObject('Object Repository/Home_page Mattermost/Page_Town Square - Test team Mattermost/createPublicChannel'))

WebUI.setText(findTestObject('Object Repository/Home_page Mattermost/Page_Town Square - Test team Mattermost/input_Name_newChannelName'), 
    name)

WebUI.setText(findTestObject('Object Repository/Home_page Mattermost/Page_Town Square - Test team Mattermost/textarea_(optional)_newChannelPurpose'), 
    purpose)

WebUI.setText(findTestObject('Object Repository/Home_page Mattermost/Page_Town Square - Test team Mattermost/textarea_(optional)_newChannelHeader'), 
    header)

WebUI.click(findTestObject('Object Repository/Home_page Mattermost/Page_Town Square - Test team Mattermost/submitNewChannel'))

