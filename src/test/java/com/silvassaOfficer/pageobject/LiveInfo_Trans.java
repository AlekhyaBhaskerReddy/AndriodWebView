package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LiveInfo_Trans {
    WebDriver driver;
    WebDriver ldriver;

    public LiveInfo_Trans(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.view.View[@content-desc='Live Info']")
    @CacheLookup
    private WebElement option_LiveInfo;

    @FindBy(xpath = "//android.view.View[@content-desc='Transaction']")
    @CacheLookup
    private WebElement option_LiveTransactions;

    public void select_LiveInfo() {
        option_LiveInfo.click();
    }

    public void select_LiveTransactions() {
        option_LiveTransactions.click();
    }

}
