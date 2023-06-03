package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Driversetup.DriverSetup.driver;


public class Login {


    @FindBy(xpath = "//div[@id=\"app\"]//header//a")
    public WebElement toolsQAHeader;

    public Login() {
        PageFactory.initElements(driver, this);
    }

    public boolean checkHeader() {
        return toolsQAHeader.isDisplayed();
    }

}
