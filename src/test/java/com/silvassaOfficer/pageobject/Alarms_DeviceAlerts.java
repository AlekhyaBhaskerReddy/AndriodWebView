package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Alarms_DeviceAlerts {
    WebDriver driver;
    WebDriver ldriver;

    public Alarms_DeviceAlerts(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.view.View[@content-desc='Alarms / Notifications']")
    @CacheLookup
    private WebElement option_AlarmsNotifications;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.TabWidget/android.view.View[2]")
    @CacheLookup
    private WebElement option_ManualAlerts;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.TabWidget/android.view.View[3]")
    @CacheLookup
    private WebElement option_VehicleOTAlerts;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton[2]")
    @CacheLookup
    private WebElement option_FourWheeler;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton[1]")
    @CacheLookup
    private WebElement option_TwoWheeler;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.TabWidget/android.view.View[4]")
    @CacheLookup
    private WebElement option_TransactionAlerts;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.TabWidget/android.view.View[5]")
    @CacheLookup
    private WebElement option_PosAlerts;

    public void select_AlarmsNotifications() {
        option_AlarmsNotifications.click();
    }

    public void select_ManualAlerts() {
        option_ManualAlerts.click();
    }

    public void select_VehicleOTAlerts() {
        option_VehicleOTAlerts.click();
    }

    public void select_VehicleOTAlerts_SelectFourWheeler() {
        option_FourWheeler.click();
    }

    public void select_VehicleOTAlerts_SelectTwoWheeler() {
        option_TwoWheeler.click();
    }

    public void select_TransactionAlerts() {
        option_TransactionAlerts.click();
    }

    public void select_PosAlerts() {
        option_PosAlerts.click();
    }
}