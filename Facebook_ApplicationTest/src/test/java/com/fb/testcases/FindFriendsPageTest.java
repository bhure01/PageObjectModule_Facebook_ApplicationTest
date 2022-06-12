package com.fb.testcases;

import com.fb.base.TestBase;
import com.fb.pages.*;
import com.fb.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindFriendsPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    EventsPage eventsPage;
    FindFriendsPage findFriendsPage;
    AllFriendsPage allFriendsPage;
    FriendRequestsPage friendRequestsPage;
    NewFriendsSuggestionPage newFriendsSuggestionPage;
    PeopleYouMayKnowPage peopleYouMayKnowPage;
    SeeAllFriendsPage seeAllFriendsPage;


    public FindFriendsPageTest() {
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        friendRequestsPage = new FriendRequestsPage();
        newFriendsSuggestionPage = new NewFriendsSuggestionPage();
        peopleYouMayKnowPage = new PeopleYouMayKnowPage();
        seeAllFriendsPage = new SeeAllFriendsPage();

        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        findFriendsPage = homePage.clickOnFindFriendsLink();
    }

    @Test(priority = 1)
    public void verifyFindFriendsPageTitleTest() {
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle,"Facebook","Home page title not matched");
    }

    @Test(priority = 2)
    public void verifyFriendRequestsLinkTest() {
        findFriendsPage = homePage.clickOnFindFriendsLink();
    }
    @Test(priority = 3)
    public void verifyNewFriendsSuggestionLinkTest() {
        findFriendsPage = homePage.clickOnFindFriendsLink();
    }
    @Test(priority = 4)
    public void verifyAllFriendsLinkTest() {
        findFriendsPage = homePage.clickOnFindFriendsLink();
    }
    @Test(priority = 5)
    public void verifyPeopleYouMayKnowLinkTest() {
        boolean flag = findFriendsPage.validatePeopleYouMayKnowLink();
        Assert.assertTrue(flag);
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
}
