package com.fb.pages;

import com.fb.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignUpPage extends TestBase {

    @FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
    WebElement createNewAccountButton;
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement enterFirstName;
    @FindBy(xpath = "//input[@name='lastname']")
    WebElement enterLastName;
    @FindBy(xpath = "//input[@name='reg_email__']")
    WebElement enterEmail;
    @FindBy(xpath = "//input[@name='reg_email_confirmation__']")
    WebElement enterConfirmEmail;
    @FindBy(xpath = "//input[@name='reg_passwd__']")
    WebElement enterPassword;
    @FindBy(xpath = "//select[@name='birthday_day']")
    WebElement enterBirthDate;
    @FindBy(xpath = "//select[@name='birthday_month']")
    WebElement enterBirthMonth;
    @FindBy(xpath = "//select[@name='birthday_year']")
    WebElement enterBirthYear;
    @FindBy(xpath = "//label[contains(text(),'Male')]")
    WebElement enterGender;
    @FindBy(xpath = "//button[@name='websubmit']")
    WebElement clickSubmitButton;

    public SignUpPage() {
        PageFactory.initElements(driver,this);
    }
    //public void createNewAccount(String ftName,String ltName,String email,String cnfrmEmail,String passwd,String date,String month,String year,String gender) {
    public HomePage createNewAccount() {
        createNewAccountButton.click();
        enterFirstName.sendKeys("demo");
        enterLastName.sendKeys("name");
        enterEmail.sendKeys("test@123");
        //enterConfirmEmail.sendKeys("test@123");
        enterPassword.sendKeys("1234565@demo");
        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByValue("15");
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByIndex(4);
        Select year = new Select(driver.findElement(By.id("year")));
        List<WebElement> gender = driver.findElements(By.name("sex"));
        gender.get(1).click();
        clickSubmitButton.click();
        return new HomePage();
    }

    public String validateSignUpPageTitle() {
        return driver.getTitle();
    }
}
