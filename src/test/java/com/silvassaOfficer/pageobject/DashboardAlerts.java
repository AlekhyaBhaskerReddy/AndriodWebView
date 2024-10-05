package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardAlerts {
    WebDriver driver;
    WebDriver ldriver;

    public DashboardAlerts(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.view.View[@class='android.view.View'][5]")
    @CacheLookup
    private WebElement click_Alerts;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[5]/android.widget.TextView[3]")
    @CacheLookup
    private WebElement getInitialAlertsData;

    public void clickon_Alerts() {
        click_Alerts.click();
    }

    public String getAlertsData() {
        return getInitialAlertsData.getText();
    }

}
