package com.talentLMS.UI.page;

import com.talentLMS.UI.dataProviders.MockDataGenerator;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Belek Baratov
 */
public abstract class BasePage {
    WebElementActions elementActions = new WebElementActions();
    MockDataGenerator mock = new MockDataGenerator();
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
