package com.talentLMS.UI.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Belek Baratov
 */

public class AddUserPage extends BasePage{
    @FindBy(xpath = "//input[@name='name']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement addUserBtn;

    /**
     * Courses Tab
     */

    @FindBy(xpath = "//th[@class='tl-align-left sorting']")
    public WebElement coursesTab;

    public AddUserPage createNewUser(){
        elementActions.sendKeys(firstNameInput,mock.generateMockFirstname())
                .sendKeys(lastNameInput,mock.generateMockLastname())
                .sendKeys(emailInput,mock.generateMockEmail())
                .sendKeysWithClear(usernameInput, mock.generateMockUsername())
                .sendKeys(passwordInput, mock.generatePassword(8))
                .click(addUserBtn);
        return this;
    }

}
