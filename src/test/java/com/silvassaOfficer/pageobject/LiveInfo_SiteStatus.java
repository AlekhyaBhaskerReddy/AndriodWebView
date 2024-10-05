package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LiveInfo_SiteStatus {
    WebDriver driver;
    WebDriver ldriver;

    public LiveInfo_SiteStatus(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.view.View[@content-desc='Live Info']")
    @CacheLookup
    private WebElement option_LiveInfo;

    @FindBy(xpath = "//android.view.View[@content-desc='Site Status']")
    @CacheLookup
    private WebElement option_SiteStatus;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Button[1]")
    @CacheLookup
    private WebElement zoomIn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Button[2]")
    @CacheLookup
    private WebElement zoomOut;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Image[1]")
    @CacheLookup
    private WebElement hover_OnSiteLocation;

    public void select_LiveInfo() {
        option_LiveInfo.click();
    }

    public void select_SiteStatus() {
        option_SiteStatus.click();
    }

    public void click_ZoomIn() {
        zoomIn.click();
        zoomIn.click();
        zoomIn.click();
    }

    public void click_ZoomOut() {
        zoomOut.click();
        zoomOut.click();
    }

    public void hover_ParkingLocation() throws InterruptedException {
        Thread.sleep(25000);
        hover_OnSiteLocation.click();
        Thread.sleep(2000);
        hover_OnSiteLocation.click();
    }
}
