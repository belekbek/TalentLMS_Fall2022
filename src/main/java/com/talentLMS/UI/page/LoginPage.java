package com.talentLMS.UI.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Belek Baratov
 */
public class LoginPage extends BasePage {

    @FindBy(xpath = "//a[text()='Hpme']")
    public WebElement homeBtn;

    @FindBy(id = "tl-cms-nav-login")
    public WebElement loginBtn;

    @FindBy(css = ".avatar-square")
    public WebElement digitalNomadsLogo;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitLoginBtn;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement loginErrMess;


    public LoginPage clickLoginBtn(){
        elementActions.click(loginBtn);
        return this;
    }

    public LoginPage fillUpUsernameAndPassword(String userName,String password){
        elementActions.sendKeys(usernameInput,userName)
                .sendKeys(passwordInput,password);
        elementActions.click(submitLoginBtn);
        return this;
    }
}
