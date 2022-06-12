package com.fb.testcases;

import com.fb.base.TestBase;
import com.fb.pages.HomePage;
import com.fb.pages.LoginPage;
import com.fb.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpPageTest extends TestBase {

    SignUpPage signUpPage;
    HomePage homePage;

    public SignUpPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        signUpPage = new SignUpPage();
        homePage = signUpPage.createNewAccount();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        String title =  signUpPage.validateSignUpPageTitle();
        Assert.assertEquals(title, "Facebook – log in or sign up");
    }
    @Test(priority = 2)
    public void signUpTest(){

    }
}

