package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardDevices {
    WebDriver driver;
    WebDriver ldriver;

    public DashboardDevices(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.view.View[@class='android.view.View'][4]")
    @CacheLookup
    private WebElement click_DeviceStatus;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.TextView[3]")
    @CacheLookup
    private WebElement getInitialDevcieStatus;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View")
    @CacheLookup
    WebElement click_ShowEntriesdrpdwnbtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    @CacheLookup
    WebElement select_25Entries;

    public void clickon_DeviceStatus() {
        click_DeviceStatus.click();
    }

    public String getDeviceStatus() {
        return getInitialDevcieStatus.getText();
    }

    public void click_ShowEntriesDropdwnoption() {
        click_ShowEntriesdrpdwnbtn.click();
    }

    public void select_25EntriesButton() {
        select_25Entries.click();
    }
}
