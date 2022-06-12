package com.fb.pages;

import com.fb.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//span[contains(text(),'John Smith')]")
    WebElement profileName;
    @FindBy(xpath = "//body/div[@id='mount_0_0_vi']/div[1]/div[1]" +
            "/div[1]/div[2]/div[4]/div[1]/div[3]/div[1]/span[1]/span[1]/div[1]")
    WebElement menuLink;
    @FindBy(xpath = "//span[contains(text(),'Find Friends')]")
    WebElement findFriendsLink;
    @FindBy(xpath = "//span[contains(text(),'Remember password')]")
    WebElement rememberPasswordLink;
    /*@FindBy(xpath = "//span[contains(text(),'Menu')]")
    WebElement newMenuLink;*/
    @FindBy(xpath = "//span[contains(text(),'Events')]")
    WebElement eventsLink;
    @FindBy(xpath = "//input[contains(@type,'search') and @xpath='1']")
    WebElement searchFriendsBoxLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public String verifyHomePageTitle() {
        return driver.getTitle();
    }
    public boolean verifyCorrectProfileName() {
        return profileName.isDisplayed();
    }

    public void clickOnProfileLink(){
        profileName.click();
    }
    public EventsPage clickOnEventsLink() {
        eventsLink.click();
        return new EventsPage();
    }
    public FindFriendsPage clickOnFindFriendsLink(){
        findFriendsLink.click();
        return new FindFriendsPage();
    }

    public void clickOnRememberPasswordLink(){
        rememberPasswordLink.click();
    }
}
