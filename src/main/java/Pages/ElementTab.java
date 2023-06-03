package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static Driversetup.DriverSetup.driver;

public class ElementTab {


    public ArrayList<String> window = new ArrayList<String>();

    public String noButton = "//input[@id=\"noRadio\"]";
    public WebElement addedUser;
    @FindBy(xpath = "//div[@class=\"card mt-4 top-card\"][1]")
    public WebElement elementTab;
    @FindBy(xpath = "//div[@class=\"pattern-backgound playgound-header\"]")
    public WebElement elementText;
    @FindBy(xpath = "//span[contains(text(),\"Text Box\")]")
    public WebElement textBox;
    @FindBy(xpath = "//div[@class=\"pattern-backgound playgound-header\"]//div")
    public WebElement header;
    @FindBy(xpath = "//div[@class=\"home-banner\"]//img[@alt=\"Selenium Online Training\"]")
    public WebElement mainHeader;
    @FindBy(id = "userName")
    public WebElement userName;
    @FindBy(id = "userEmail")
    public WebElement userEmail;
    @FindBy(id = "currentAddress")
    public WebElement currentAddress;
    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;
    @FindBy(xpath = "//*[@id=\"submit\"]")
    public WebElement submitButton;
    @FindBy(xpath = "//div[@class=\"border col-md-12 col-sm-12\"]")
    public WebElement outputHeader;
    @FindBy(xpath = "//span[contains(text(),\"Check Box\")]")
    public WebElement checkboxTab;
    @FindBy(xpath = "//div[@id=\"result\"]")
    public WebElement checkboxResult;
    @FindBy(xpath = "//span[contains(text(),\"Radio Button\")]")
    public WebElement radioButton;
    @FindBy(xpath = "//span[contains(text(),\"Buttons\")]")
    public WebElement buttonTab;
    @FindBy(xpath = "//p[@class=\"mt-3\"]")
    public WebElement message;
    @FindBy(xpath = "//button[@id=\"addNewRecordButton\"]")
    public WebElement addButton;
    @FindBy(xpath = "//div[@id=\"registration-form-modal\"]")
    public WebElement registrationForm;
    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(id = "age")
    public WebElement age;
    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirth;
    @FindBy(id = "salary")
    public WebElement salary;
    @FindBy(id = "department")
    public WebElement department;
    @FindBy(id = "userNumber")
    public WebElement mobileNumber;
    @FindBy(xpath = "//div[@class=\"rt-tbody\"]")
    public WebElement userTable;
    @FindBy(xpath = "//div[@class=\"action-buttons\"]//span[@title=\"Delete\"]")
    public WebElement deleteButton;
    @FindBy(xpath = "//input[@id=\"searchBox\"]")
    public WebElement searchBox;
    @FindBy(xpath = "//div[@class=\"container playgound-body\"]//div[3]//button")
    public WebElement leftClickButton;
    @FindBy(xpath = "//p[contains(text(),\"You have done a double click\")]")
    public WebElement doubleClickMessage;
    @FindBy(xpath = "//p[contains(text(),\"You have done a right click\")]")
    public WebElement rightClickMessage;
    @FindBy(xpath = "//p[contains(text(),\"You have done a dynamic click\")]")
    public WebElement randomClickMessage;
    @FindBy(id = "simpleLink")
    public WebElement homeLink;
    @FindBy(id = "created")
    public WebElement created;
    @FindBy(id = "linkResponse")
    public WebElement linkResponse;
    @FindBy(id = "no-content")
    public WebElement noContent;
    @FindBy(id = "moved")
    public WebElement moved;
    @FindBy(id = "bad-request")
    public WebElement badRequest;
    @FindBy(id = "unauthorized")
    public WebElement unauthorized;
    @FindBy(id = "forbidden")
    public WebElement forbidden;
    @FindBy(id = "invalid-url")
    public WebElement invalidURL;
    @FindBy(xpath = "//img[@alt=\"Selenium Online Training\"]")
    public WebElement selenium;
    @FindBy(xpath = "//h3[text()=\"Status Codes\"]")
    public WebElement brokenLink;
    @FindBy(xpath = "//select[@class=\"react-datepicker__month-select\"]")
    public WebElement selectMonth;
    @FindBy(xpath = "//select[@class=\"react-datepicker__year-select\"]")
    public WebElement selectYear;
    @FindBy(xpath = "//div[text()=\"Thanks for submitting the form\"]")
    public WebElement messageModal;
    @FindBy(id = "closeLargeModal")
    public WebElement closeButton;
    @FindBy(id = "sampleHeading")
    public WebElement sampleHeading;
    @FindBy(id = "state")
    public WebElement stateFilter;
    @FindBy(xpath = "//div[@class=\" css-11unzgr\"]")
    public WebElement dropdownFilter;
    @FindBy(id = "timerAlertButton")
    public WebElement timeAlertButton;
    @FindBy(id = "confirmButton")
    public WebElement confirmButton;
    @FindBy(xpath = "//div[contains(text(),\"NCR\")]")
    public WebElement selectNCR;
    @FindBy(xpath = "//div[contains(text(),\"Uttar Pradesh\")]")
    public WebElement selectUttarPradesh;
    @FindBy(xpath = "//div[contains(text(),\"Haryana\")]")
    public WebElement selectHaryana;
    @FindBy(xpath = "//div[contains(text(),\"Rajasthan\")]")
    public WebElement selectRajasthan;
    @FindBy(xpath = "//div[@id=\"city\"]")
    public WebElement cityFilter;


    public ElementTab() {
        PageFactory.initElements(driver, this);
    }

    public void clickElementTab() {
        elementTab.click();
    }

    public boolean verifySeleniumIsDisplayed() {
        return selenium.isDisplayed();
    }

    public String getElementText() {
        return elementText.getText();
    }

    public void clickTextBox() {
        textBox.click();
    }

    public String verifyTextHeader() {
        return header.getText();
    }

    public void addUsername(String username) {
        userName.sendKeys(username);
    }

    public void addEmailAddress(String setUserEmail) {
        userEmail.sendKeys(setUserEmail);
    }

    public void addCurrentAddress(String addCurrentAddress) {
        currentAddress.sendKeys(addCurrentAddress);
    }

    public void addPermanentAddress(String addPermanentAddress) {
        permanentAddress.sendKeys(addPermanentAddress);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean verifyOutputHeaderIsDisplayed() {
        return outputHeader.isDisplayed();
    }

    public void scrollDown(String range) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + range + ")");
    }

    public void clickCheckBoxTab() {
        checkboxTab.click();
    }

    public void verifyCheckbox() {
        WebElement checkbox = driver.findElement(By.xpath("//span[@class=\"rct-checkbox\"]"));
        if (!checkbox.isSelected())
            checkbox.click();
    }

    public boolean verifyCheckboxResult() {
        return checkboxResult.isDisplayed();
    }

    public void clickRadioButton() {
        radioButton.click();
    }

    public ArrayList<Object> verifyRadioButton() {
        ArrayList totalRadioButtons = new ArrayList<String>();
        List<WebElement> radio = driver.findElements(By.xpath("//label[@class=\"custom-control-label\"]"));
        for (int i = 0; i < radio.size(); i++) {
            String data = radio.get(i).getText();
            totalRadioButtons.add(i, data);
        }
        return totalRadioButtons;
    }

    public String clickYesRadioButton() {
        WebElement element = driver.findElement(By.xpath("(//input[@type=\"radio\"])"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        return message.getText();
    }

    public String clickImpressiveRadioButton() {
        WebElement element = driver.findElement(By.xpath("//input[@id=\"impressiveRadio\"]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        return message.getText();
    }

    public void noRadioButton() {
        WebElement element = driver.findElement(By.xpath(noButton));
        if (element.isEnabled()) {
            System.out.println("Radio button is enabled");
        } else {
            System.out.println("Radio button is disabled");
        }
    }

    public String clickWebTables() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),\"Web Tables\")]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        return header.getText();
    }

    public void clickAddButton() {
        addButton.click();
    }

    public boolean verifyRegistrationFormIsDisplayed() {
        return registrationForm.isDisplayed();
    }

    public void addDataInForm(String field, String value) {
        if (field.equalsIgnoreCase("firstName")) {
            firstName.sendKeys(value);
        }
        if (field.equalsIgnoreCase("lastName")) {
            lastName.sendKeys(value);
        }
        if (field.equalsIgnoreCase("email")) {
            userEmail.sendKeys(value);
        }
        if (field.equalsIgnoreCase("age")) {
            age.sendKeys(value);
        }
        if (field.equalsIgnoreCase("salary")) {
            salary.sendKeys(value);
        }
        if (field.equalsIgnoreCase("department")) {
            department.sendKeys(value);
        }
        if (field.equalsIgnoreCase("Mobile")) {
            mobileNumber.sendKeys(value);
        }
    }

    public String verifyUserIsDisplayedInTable() {
        return userTable.getText();
    }

    public void removeAddedUser(String user) {
        addedUser = driver.findElement(By.xpath("//div[@role=\"rowgroup\"]/div//div[contains(text(),\"" + user + "\")]"));
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }

    public void deleteUser(String user) {
        removeAddedUser(user);
        clickDeleteButton();
    }

    public void searchUser(String user) {
        searchBox.click();
        searchBox.sendKeys(user);
    }

    public String verifyButtonTabIsOpened() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),\"Buttons\")]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        return header.getText();
    }

    public void doubleClickButton() {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(element).perform();
    }

    public String verifyDoubleClickMessage() {
        return doubleClickMessage.getText();
    }

    public void verifyRightClick() {
        Actions actions = new Actions(driver);
        WebElement right = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(right).perform();
    }

    public String verifyRightClickMessage() {
        return rightClickMessage.getText();
    }

    public void verifyRandomClick() {
        leftClickButton.click();
    }

    public String verifyRandomClickMessage() {
        return randomClickMessage.getText();
    }

    public String verifyLinksTabIsOpened() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),\"Links\")]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        return header.getText();
    }

    public void clickHomeLink() {
        homeLink.click();
    }


    public String verifyLinkResponse() {
        return linkResponse.getText();
    }

    public void clickCreatedAPI() {
        created.click();

    }

    public void clickNoContentAPI() {
        noContent.click();
    }

    public void clickMovedAPI() {
        moved.click();

    }

    public void clickBadRequestAPI() {
        badRequest.click();

    }

    public void clickUnauthorizedAPI() {
        unauthorized.click();

    }

    public void clickForbiddenAPI() {
        forbidden.click();

    }

    public void clickNotFound() {
        invalidURL.click();
    }

    public void clickAlertsButton() {
        WebElement alerts = driver.findElement(By.xpath("//div[contains(text(),\"Alerts, Frame & Windows\")]"));
        alerts.click();
    }

    public String clickBrowserWindows() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),\"Browser Windows\")]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
        return header.getText();
    }


    public void clickLink(String value) {
        WebElement element = driver.findElement(By.xpath("//div[@id=\"linkWrapper\"]/p/a[@id=\"" + value + "\"]"));
        element.click();
    }

    public void clickLinks(String value) {
        WebElement element = driver.findElement(By.xpath("//div[@class=\"col-12 mt-4 col-md-6\"]//a[text()=\"" + value + "\"]"));
        element.click();
    }

    public void verifyWindowHandle() {
        window = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(window.get(1));
    }

    public void backToCurrentWindow() {
        driver.close();
        driver.switchTo().window(window.get(0));
    }

    public boolean newHeader() {
        return mainHeader.isDisplayed();
    }

    public String clickBrokenLinks() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),\"Broken Links - Images\")]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        return header.getText();
    }

    public boolean verifyBrokenLink() {
        return brokenLink.isDisplayed();
    }

    public String clickPracticeForm() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),\"Practice Form\")]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        return header.getText();
    }

    public void selectGenderInPracticeForm(String value) {
        WebElement element = driver.findElement(By.xpath("//div//input[@value=\"" + value + "\"]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void selectMonthFromDropdown(String month) {
        dateOfBirth.click();
        selectMonth.click();
        WebElement monthEle = driver.findElement(By.xpath("//option[contains(text(),\"" + month + "\")]"));
        monthEle.click();
    }

    public void selectYearFromDropdown(String year) {
        selectYear.click();
        WebElement yearEle = driver.findElement(By.xpath("//option[contains(text(),\"" + year + "\")]"));
        yearEle.click();
    }

    public void selectDateFromDropdown(String date) {
        WebElement dateEle = driver.findElement(By.xpath("//div[contains(text(),\"" + date + "\")]"));
        dateEle.click();
    }

    public void selectCheckbox(String value) {
        WebElement element = driver.findElement(By.xpath("//label[contains(text(),\"" + value + "\")]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void selectStateDropdowns(String type) throws InterruptedException {
        stateFilter.click();
        Thread.sleep(2000);
        if (type.equalsIgnoreCase("NCR")){
            selectNCR.click();
        }if (type.equalsIgnoreCase("Uttar Pradesh")){
            selectUttarPradesh.click();
        }if (type.equalsIgnoreCase("Haryana")){
            selectHaryana.click();
        }if (type.equalsIgnoreCase("Rajasthan")){
            selectRajasthan.click();
        }
    }

    public void selectCityDropdown(String type) throws InterruptedException {
        cityFilter.click();
        Thread.sleep(2000);
        if (type.equalsIgnoreCase("Delhi")){
            WebElement delhi = driver.findElement(By.xpath("//div[contains(text(),\"Delhi\")]"));
            delhi.click();
        }if (type.equalsIgnoreCase("Gurgaon")){
            WebElement gurgaon = driver.findElement(By.xpath("//div[contains(text(),\"Gurgaon\")]"));
            gurgaon.click();
        }if (type.equalsIgnoreCase("Noida")){
            WebElement noida = dropdownFilter.findElement(By.xpath("//div[contains(text(),\"Noida\")]"));
            noida.click();
        }
    }

    public void addAddress(String value) {
        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys(value);
    }

    public String verifyMessageModal() {
        return messageModal.getText();
    }

    public void clickCloseButton() {
        closeButton.click();
    }

    public void clickNewTabOrWindowButton(String value) {
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),\"" + value + "\")]"));
        element.click();
    }

    public String verifySampleHeading() {
        return sampleHeading.getText();
    }

    public String clickAlerts() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),\"Alerts\")]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        return header.getText();
    }

    public void verifyNewWindowMessage() {
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),\"New Window Message\")]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);

    }

    public String verifyTabOpened(String value) {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),\"" + value + "\")]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
        return header.getText();
    }

    public void verifyAlertMessageIsDisplayed() {
        WebElement element = driver.findElement(By.id("alertButton"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
    }

    public void verifyTimeAlertMessageIsDisplayed() throws InterruptedException {
        timeAlertButton.click();
        Thread.sleep(5000);
        Alert timeAlert = driver.switchTo().alert();
        timeAlert.accept();
    }

    public void verifyConfirmButtonIsDisplayed() {
        confirmButton.click();
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.accept();
    }

    public void verifyPromptBoxIsAppeared(String value) {
        WebElement element = driver.findElement(By.id("promtButton"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.sendKeys(value);
        alert.accept();
    }


    public String verifyHeaderText() {

        return header.getText();
    }
}

