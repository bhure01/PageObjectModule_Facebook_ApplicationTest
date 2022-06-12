package com.fb.testcases;

import com.fb.base.TestBase;
import com.fb.pages.*;
import com.fb.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    EventsPage eventsPage;
    FindFriendsPage findFriendsPage;


    public HomePageTest() {
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority = 1)
    public void verifyHomePageTitleTest() {
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle,"Facebook – log in or sign up","Home page title not matched");
    }

    @Test(priority = 2)
    public void verifyProfileNameTest(){
        Assert.assertTrue(homePage.verifyCorrectProfileName());
    }

    @Test(priority = 3)
    public void verifyEventsLinkTest() {
        eventsPage = homePage.clickOnEventsLink();
    }
    @Test(priority = 4)
    public void verifyFindFriendsLinkTest() {
        findFriendsPage = homePage.clickOnFindFriendsLink();
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
}
