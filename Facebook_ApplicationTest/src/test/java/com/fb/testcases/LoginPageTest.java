package com.fb.testcases;

import com.fb.base.TestBase;
import com.fb.pages.HomePage;
import com.fb.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        String title =  loginPage.validateLoginPageTitle();  // it returns a String & store it
        Assert.assertEquals(title, "Facebook – log in or sign up");
    }

    @Test(priority = 2)
    public void cfbLogoImageTest() {
        boolean flag = loginPage.validateFbLogo();
        Assert.assertTrue(flag);
    }

    @Test(priority = 5)
    public void loginTest() {
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority = 3)
    public void signUpLinkTest(){
        boolean flag = loginPage.validateSignUpLink();
        Assert.assertTrue(flag);
    }

    @Test(priority = 4)
    public void forgotPasswordLinkTest(){
        boolean flag = loginPage.validateForgotPasswordLink();
        Assert.assertTrue(flag);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
