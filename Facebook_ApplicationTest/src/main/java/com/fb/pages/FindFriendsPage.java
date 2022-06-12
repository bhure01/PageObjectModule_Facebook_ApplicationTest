package com.fb.pages;

import com.fb.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindFriendsPage extends TestBase {

    @FindBy(xpath = "//div[@xpath='1']")
    WebElement friendRequestsLink;
    @FindBy(xpath = "//span[@xpath='1']")
    WebElement allFriendsLink;
    @FindBy(xpath = "//span[contains(text(),'People you may know')]")
    WebElement peopleYouMayKnowLink;
    @FindBy(xpath = "//span[contains(text(),'Suggestions')]")
    WebElement newFiendsSuggestionsLink;


    public FindFriendsPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyFindFriendsPageTitle() {
        return driver.getTitle();
    }

    public FriendRequestsPage clickOnFriendRequestsLink() {
        friendRequestsLink.click();
        return new FriendRequestsPage();
    }
    public AllFriendsPage clickOnAllFriendsLink() {
        allFriendsLink.click();
        return new AllFriendsPage();
    }

    public PeopleYouMayKnowPage clickOnPeopleYouMayKnowLink() {
        peopleYouMayKnowLink.click();
        return new PeopleYouMayKnowPage();
    }
    public NewFriendsSuggestionPage clickOnNewFriendsSuggestionLink() {
        newFiendsSuggestionsLink.click();
        return new NewFriendsSuggestionPage();
    }
    public boolean validatePeopleYouMayKnowLink() {
        return peopleYouMayKnowLink.isDisplayed();
    }
}


