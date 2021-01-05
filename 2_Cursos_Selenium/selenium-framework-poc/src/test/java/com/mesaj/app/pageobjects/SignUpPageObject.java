package com.mesaj.app.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class SignUpPageObject {

    public SignUpPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstNameTextbox;

    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement lastName;

    @FindBy(xpath = "//form[@id='basicBootstrapForm']/div[2]/div/textarea")
    private WebElement address;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@type='tel']")
    private WebElement phone;

    @FindBy(xpath = "//input[@value='Male']")
    private WebElement genderMale;

    @FindBy(xpath = "//input[@value='Female']")
    private WebElement genderFemale;

    @FindBy(xpath = "//input[@value='Cricket']")
    private WebElement hobbiesOne;

    @FindBy(xpath = "//input[@value='Movies']")
    private WebElement hobbiesTwo;

    @FindBy(xpath = "//input[@value='Hockey']")
    private WebElement hobbiesThree;

    @FindBy(id = "Skills")
    private WebElement skill;

    @FindBy(id = "countries")
    private WebElement country;

    @FindBy(id = "yearbox")
    private WebElement dateOfBrithYear;

    @FindBy(xpath = "//select[@ng-model='monthbox']")
    private WebElement dateOfBrithMonth;

    @FindBy(id = "daybox")
    private WebElement dateOfBrithDay;

    @FindBy(id = "firstpassword")
    private WebElement password;

    @FindBy(id = "secondpassword")
    private WebElement confirmPassword;

    @FindBy(id = "submitbtn")
    private WebElement submit;

}