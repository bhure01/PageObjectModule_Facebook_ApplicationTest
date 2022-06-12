package com.fb.pages;

import com.fb.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    @FindBy(name = "email")
    WebElement userName;

    @FindBy(name = "pass")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='_8ice']//img[@class='fb_logo _8ilh img']")
    WebElement fbLogo;

    @FindBy(xpath = "//a[contains(text(),'Create New Account')]")
    WebElement signUpButton;
    @FindBy(xpath = "//a[contains(text(),'Forgotten password?')]")
    WebElement forgetPasswordLink;

    public LoginPage(){
        PageFactory.initElements(driver,this);   // driver is coming from TestBase class. this->pointing to current class object
    }
    public String validateLoginPageTitle() {
        return driver.getTitle();
    }
    public boolean validateFbLogo() {
        return fbLogo.isDisplayed();
    }
    public HomePage login(String un, String pwd) {    //pass 2 String variables
        userName.sendKeys(un);
        password.sendKeys(pwd);
        loginButton.click();
        return new HomePage();
    }
    public boolean validateSignUpLink() {
        return signUpButton.isDisplayed();
    }
    public boolean validateForgotPasswordLink() {
        return forgetPasswordLink.isDisplayed();
    }

}
