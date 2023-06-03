import Driversetup.DriverSetup;
import Pages.Login;
import Utilities.ReadPropertiesFile;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Test extends DriverSetup {

    public Login login;
    public ReadPropertiesFile readPropertiesFile;

    @BeforeClass
    public void pageObject() {
        login = new Login();
        readPropertiesFile = new ReadPropertiesFile();
    }


    @Test(priority = 0, description = "Verify that header is getting displayed")
    public void verifyHeaderIsDisplayed() {
        Assert.assertTrue(login.checkHeader());
    }

}
