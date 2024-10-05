package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AttenderLiveSessions {
    WebDriver driver;
    WebDriver ldriver;

    public AttenderLiveSessions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.view.View[@content-desc='Attender Live Sessions']")
    @CacheLookup
    private WebElement option_AttenderLiveSessions;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View")
    @CacheLookup
    private WebElement option_ShowEntries;

    public void select_AttenderLiveSessions() {
        option_AttenderLiveSessions.click();
    }

    public void select_ShowEntries() {
        option_ShowEntries.click();
    }
}
