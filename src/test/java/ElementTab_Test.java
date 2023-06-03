import Driversetup.DriverSetup;
import Pages.ElementTab;
import Pages.Login;
import Utilities.ReadPropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ElementTab_Test extends DriverSetup {

    public ElementTab elementTab;
    public Login login;
    public ReadPropertiesFile readPropertiesFile;


    public String name, email, current_Address, permanent_Address, message, impressiveMessage, first, last, salary, age, department, created, noContent, moved, badRequest, unauthorized, forbidden, notFound, mobile, dob, address;

    @BeforeClass
    public void pageObject() {
        elementTab = new ElementTab();
        login = new Login();
        readPropertiesFile = new ReadPropertiesFile();
        name = readPropertiesFile.getPropertyValue("Element.properties", "name");
        email = readPropertiesFile.getPropertyValue("Element.properties", "email");
        first = readPropertiesFile.getPropertyValue("Element.properties", "first");
        last = readPropertiesFile.getPropertyValue("Element.properties", "last");
        salary = readPropertiesFile.getPropertyValue("Element.properties", "salary");
        age = readPropertiesFile.getPropertyValue("Element.properties", "age");
        mobile = readPropertiesFile.getPropertyValue("Element.properties", "mobile");
        dob = readPropertiesFile.getPropertyValue("Element.properties", "dob");
        department = readPropertiesFile.getPropertyValue("Element.properties", "department");
        current_Address = readPropertiesFile.getPropertyValue("Element.properties", "currentAddress");
        permanent_Address = readPropertiesFile.getPropertyValue("Element.properties", "permanentAddress");
        message = readPropertiesFile.getPropertyValue("Element.properties", "yes");
        impressiveMessage = readPropertiesFile.getPropertyValue("Element.properties", "impressive");
        created = readPropertiesFile.getPropertyValue("Element.properties", "created");
        noContent = readPropertiesFile.getPropertyValue("Element.properties", "noContent");
        moved = readPropertiesFile.getPropertyValue("Element.properties", "moved");
        badRequest = readPropertiesFile.getPropertyValue("Element.properties", "badRequest");
        unauthorized = readPropertiesFile.getPropertyValue("Element.properties", "unauthorized");
        forbidden = readPropertiesFile.getPropertyValue("Element.properties", "forbidden");
        notFound = readPropertiesFile.getPropertyValue("Element.properties", "notFound");
        address = readPropertiesFile.getPropertyValue("Element.properties", "address");
    }

    @Test(priority = 1, description = "verify that element tab is opened")
    public void openElementTab() {
        elementTab.clickElementTab();
        Assert.assertEquals(elementTab.getElementText(), readPropertiesFile.getPropertyValue("Element.properties", "elementText"));
    }

    @Test(priority = 2, description = "Verify that text box page opened")
    public void clickOnTextBox() {
        elementTab.clickTextBox();
        Assert.assertEquals(elementTab.verifyTextHeader(), "Text Box");
    }

    @Test(priority = 3, description = "Verify that user is able to submit the text box form")
    public void verifySubmitTextBox() {
        elementTab.addUsername(name);
        elementTab.addEmailAddress(email);
        elementTab.addCurrentAddress(current_Address);
        elementTab.addPermanentAddress(permanent_Address);
        elementTab.scrollDown("350");
        elementTab.clickSubmitButton();
        Assert.assertTrue(elementTab.verifyOutputHeaderIsDisplayed(), "Output header is not getting displayed");
    }

    @Test(priority = 4, description = "Verify the checkbox")
    public void verifyCheckbox() {
        elementTab.clickCheckBoxTab();
        elementTab.verifyCheckbox();
        Assert.assertTrue(elementTab.verifyCheckboxResult(), "Checkbox result is not getting displayed");
    }

    @Test(priority = 5, description = "Verify radio buttons")
    public void verifyRadioButtons() {
        elementTab.clickRadioButton();
        ArrayList<Object> totalButtons = elementTab.verifyRadioButton();
        Assert.assertEquals(totalButtons.toString(), readPropertiesFile.getPropertyValue("Element.properties", "radioButtons"));
    }

    @Test(priority = 6, description = "Click on Yes radio button")
    public void clickRadioButton() throws InterruptedException {
        elementTab.clickYesRadioButton();

        System.out.println(elementTab.clickYesRadioButton());
        Assert.assertEquals(elementTab.clickYesRadioButton(), message);
        elementTab.clickImpressiveRadioButton();

        System.out.println(elementTab.clickImpressiveRadioButton());
        Assert.assertEquals(elementTab.clickImpressiveRadioButton(), impressiveMessage);
        elementTab.noRadioButton();

    }

    @Test(priority = 7, description = "Verify web tables page opened")
    public void verifyWebTablesPageIsOpened() {
        elementTab.clickWebTables();
        Assert.assertTrue(elementTab.clickWebTables().contains("Web Tables"), "Web Tables page is not opened");
    }

    @Test(priority = 8, description = "Verify that user is able to add data in Web tables")
    public void addDataInWebTable() {
        elementTab.clickAddButton();
        elementTab.verifyRegistrationFormIsDisplayed();
        elementTab.addDataInForm("firstName", first);
        elementTab.addDataInForm("lastName", last);
        elementTab.addDataInForm("email", email);
        elementTab.addDataInForm("age", age);
        elementTab.addDataInForm("salary", salary);
        elementTab.addDataInForm("department", department);
        elementTab.clickSubmitButton();
        Assert.assertTrue(elementTab.verifyUserIsDisplayedInTable().contains(first), "User is not getting displayed");
    }

    @Test(priority = 9, description = "Delete the added user")
    public void deleteAddedUser() {
        elementTab.searchUser(first);
        elementTab.deleteUser(first);

    }

    @Test(priority = 10, description = "Verify button tab is opened")
    public void verifyButtonTab() {
        elementTab.verifyButtonTabIsOpened();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"pattern-backgound playgound-header\"]//div")));
        Assert.assertTrue(elementTab.verifyButtonTabIsOpened().contains("Buttons"));
    }

    @Test(priority = 11, description = "Verify the button functionalities")
    public void verifyButtonFunctionalities() {
        elementTab.doubleClickButton();

        Assert.assertEquals(elementTab.verifyDoubleClickMessage(), readPropertiesFile.getPropertyValue("Element.properties", "doubleClickMessage"));
        elementTab.verifyRightClick();

        Assert.assertEquals(elementTab.verifyRightClickMessage(), readPropertiesFile.getPropertyValue("Element.properties", "rightClickMessage"));
        elementTab.verifyRandomClick();

        Assert.assertEquals(elementTab.verifyRandomClickMessage(), readPropertiesFile.getPropertyValue("Element.properties", "randomClickMessage"));
    }

    @Test(priority = 12, description = "Verify Links tab is opened")
    public void verifyLinksTab() {
        elementTab.verifyLinksTabIsOpened();
        Assert.assertTrue(elementTab.verifyLinksTabIsOpened().contains("Links"));
    }

    @Test(priority = 13, description = "Verify all browser links")
    public void verifyLinkIsOpenedInNewTab() {
        elementTab.clickLink("simpleLink");
        elementTab.verifyWindowHandle();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"Selenium Online Training\"]")));
        Assert.assertTrue(elementTab.verifySeleniumIsDisplayed(), "Selenium text is not getting displayed");
        elementTab.backToCurrentWindow();
        elementTab.clickLink("dynamicLink");
        elementTab.verifyWindowHandle();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"Selenium Online Training\"]")));
        Assert.assertTrue(elementTab.verifySeleniumIsDisplayed(), "Selenium text is not getting displayed");
        elementTab.backToCurrentWindow();
    }

    @Test(priority = 14, description = "Verify API responses after clicking links")
    public void verifyAPIResponses() throws InterruptedException {
        elementTab.clickCreatedAPI();
        Thread.sleep(500);
        Assert.assertEquals(elementTab.verifyLinkResponse(), created);
        elementTab.clickNoContentAPI();
        Thread.sleep(500);
        Assert.assertEquals(elementTab.verifyLinkResponse(), noContent);
        elementTab.clickMovedAPI();
        Thread.sleep(500);
        Assert.assertEquals(elementTab.verifyLinkResponse(), moved);
        elementTab.clickBadRequestAPI();
        Thread.sleep(500);
        Assert.assertEquals(elementTab.verifyLinkResponse(), badRequest);
        elementTab.clickUnauthorizedAPI();
        Thread.sleep(500);
        Assert.assertEquals(elementTab.verifyLinkResponse(), unauthorized);
        elementTab.clickForbiddenAPI();
        Thread.sleep(500);
        Assert.assertEquals(elementTab.verifyLinkResponse(), forbidden);
        elementTab.clickNotFound();
        Thread.sleep(500);
        Assert.assertEquals(elementTab.verifyLinkResponse(), notFound);
    }

    @Test(priority = 15, description = "Verify Broken Links - Images is displayed")
    public void verifyBrokenLinksIsOpened() {
        elementTab.clickBrokenLinks();
        Assert.assertTrue(elementTab.clickBrokenLinks().contains("Broken Links - Images"));
    }

    @Test(priority = 16, description = "Verify valid link is opened")
    public void verifyValidLink() {
        elementTab.clickLinks("Click Here for Valid Link");
        Assert.assertTrue(elementTab.verifySeleniumIsDisplayed(), "Selenium text is not displayed");
    }

    @Test(priority = 17, description = "Verify broken link is opened")
    public void verifyBrokenLink() {
        driver.navigate().back();
        elementTab.clickLinks("Click Here for Broken Link");
        Assert.assertTrue(elementTab.verifyBrokenLink(), "Broken link page is not dispalyed");
    }

    @Test(priority = 18, description = "Verify practice form is opened")
    public void verifyPracticeForm() {
        driver.navigate().back();
        elementTab.clickPracticeForm();
        Assert.assertTrue(elementTab.verifyTextHeader().contains("Practice Form"), "Practice form is not opened");
    }

    @Test(priority = 19, description = "Fill the student application form")
    public void verifyFormIsFilled() throws InterruptedException {
        elementTab.addDataInForm("firstName", first);
        elementTab.addDataInForm("lastName", last);
        elementTab.addDataInForm("email", email);
        elementTab.selectGenderInPracticeForm("Male");
        elementTab.addDataInForm("mobile", mobile);
        elementTab.selectMonthFromDropdown("June");
        elementTab.selectYearFromDropdown("1998");
        elementTab.selectDateFromDropdown("29");
        elementTab.selectCheckbox("Sports");
        elementTab.selectCheckbox("Reading");
        elementTab.selectCheckbox("Music");
        elementTab.addAddress(address);
        elementTab.scrollDown("350");
        elementTab.selectStateDropdowns("NCR");
        elementTab.selectCityDropdown("Noida");
        Thread.sleep(3000);
        elementTab.clickSubmitButton();
        Assert.assertEquals(elementTab.verifyMessageModal(), "Thanks for submitting the form");
        elementTab.clickCloseButton();
    }

    @Test(priority = 20, description = "Verify tab is opened in new tab")
    public void verifyLinkOpenedInNewTab() {
        elementTab.clickBrowserWindows();
        elementTab.clickNewTabOrWindowButton("New Tab");
        elementTab.verifyWindowHandle();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("sampleHeading")));
        Assert.assertEquals(elementTab.verifySampleHeading(), "This is a sample page");
        elementTab.backToCurrentWindow();
    }

    @Test(priority = 21, description = "Verify link opened in new window")
    public void verifyLinkOpenedInNewWindow() {
        elementTab.clickNewTabOrWindowButton("New Window");
        elementTab.verifyWindowHandle();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("sampleHeading")));
        Assert.assertEquals(elementTab.verifySampleHeading(), "This is a sample page");
        elementTab.backToCurrentWindow();
    }

    @Test(priority = 22, description = "Verify that alerts page is opened")
    public void verifyAlertsTabIsOpened() {
        elementTab.verifyTabOpened("Alerts");
        Assert.assertTrue(elementTab.clickAlerts().contains("Alerts"));
    }

    @Test(priority = 23, description = "Verify simple alert message is displayed")
    public void verifySimpleAlertMessage() {
        elementTab.verifyAlertMessageIsDisplayed();
        Assert.assertTrue(elementTab.verifyHeaderText().contains("Alerts"));
    }

    @Test(priority = 24, description = "Verify that alert box is getting displayed after 5 sec of clicking")
    public void verifyAlertIsDisplayedAfter5Sec() throws InterruptedException {
        elementTab.verifyTimeAlertMessageIsDisplayed();
        Assert.assertTrue(elementTab.verifyHeaderText().contains("Alerts"));
    }

    @Test(priority = 25, description = "Verify confirmation box is getting displayed")
    public void verifyConfirmationBox() {
        elementTab.verifyConfirmButtonIsDisplayed();
        Assert.assertTrue(elementTab.verifyHeaderText().contains("Alerts"));
    }

    @Test(priority = 26, description = "Verify that prompt box is getting appeared when click on button")
    public void verifyPromptBoxIsDisplayed() {
        elementTab.verifyPromptBoxIsAppeared("Test");
        Assert.assertTrue(elementTab.verifyHeaderText().contains("Alerts"));
    }
}
