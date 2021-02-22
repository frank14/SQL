package com.mesaj.app.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeServices {

    @Autowired
    private HomePageObject homePageObject;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void go(String url) {
        this.driver.get(url);
    }

    public void clickOnProfileButton() {
        this.wait.until(ExpectedConditions.visibilityOf(this.homePageObject.getProfileButton()));
        this.homePageObject.getProfileButton().click();
    }

    public void clickOnLogOutButton() {
        this.wait.until(ExpectedConditions.visibilityOf(this.homePageObject.getLogOutButton()));
        this.homePageObject.getLogOutButton().click();
    }

}