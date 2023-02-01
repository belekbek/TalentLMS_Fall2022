package uiTests;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.AddUserPage;
import com.talentLMS.UI.page.AdminHomePage;
import com.talentLMS.UI.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest {
    LoginPage loginPage;
    WebElementActions webElementActions;
    WebDriver driver;
    AdminHomePage adminHomePage;
    AddUserPage addUserPage;
    @BeforeClass
    public void setUpUiTest(){
        loginPage = new LoginPage();
        adminHomePage = new AdminHomePage();
        webElementActions = new WebElementActions();
        driver = Driver.getDriver();
        addUserPage = new AddUserPage();
    }
//    @AfterClass
//    public void tearDown(){
//        Driver.closeDriver();
//    }
}