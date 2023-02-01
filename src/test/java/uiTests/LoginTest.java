package uiTests;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
/**
 * @author Belek Baratov
 */

public class LoginTest extends BaseUiTest{
    @BeforeMethod
    public void openLoginPage(){
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
    }


    @Test(description = "Verify that user can login with valid credentials")
    public void loginWithValidCredentials(){
        loginPage.fillUpUsernameAndPassword("belekbaratov", "b9081m");
//        assertEquals(adminHomePage.users.getText(), "USERS");
        assertEquals(driver.getCurrentUrl(),"https://bughuntertest.talentlms.com/dashboard");
    }


    @Test(description = "Verify user can not login with invalid username and valid password")
    public void loginWithInvalidUserNameTest(){
        loginPage.fillUpUsernameAndPassword("testName", "b9081m");
        String expectedErrMess = "Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.";
        assertEquals(loginPage.loginErrMess.getText(), expectedErrMess);
    }

    @Test(description = "Verify user can not login with valid username and invalid password")
    public void loginWithInvalidPasswordTest(){
        loginPage.fillUpUsernameAndPassword("belekbaratov", "sasaAXD");
        String expectedErrMess = "Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.";
        assertEquals(loginPage.loginErrMess.getText(), expectedErrMess);
    }
    @Test(description =  " verify that Admin can create new user in TalentLMS")
    public void createNewUserTest(){
        loginPage.fillUpUsernameAndPassword("belekbaratov", "b9081m");
        adminHomePage.clickAddUserBtn();
        assertEquals(driver.getCurrentUrl(), "https://bughuntertest.talentlms.com/user/create");
        addUserPage.createNewUser();
        assertEquals(addUserPage.coursesTab.getText(), "COURSE");
        webElementActions.pause(5000);
    }

}