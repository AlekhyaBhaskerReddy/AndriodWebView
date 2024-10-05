package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteReports_DeviceStatus {
    WebDriver driver;
    WebDriver ldriver;

    public SiteReports_DeviceStatus(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]")
    @CacheLookup
    WebElement clickonDeviceStatus;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.TextView[3]")
    @CacheLookup
    WebElement getInitialSiteDevicePercentage;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View")
    @CacheLookup
    WebElement click_ShowEntriesdrpdwnbtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    @CacheLookup
    WebElement select_25Entries;

    public void click_DeviceStatus() {
        clickonDeviceStatus.click();
    }

    public String getValue_SiteDevicePercent() {
        String carddata = getInitialSiteDevicePercentage.getText();
        return carddata;
    }

    public void click_ShowEntriesDropdwnoption() {
        click_ShowEntriesdrpdwnbtn.click();
    }

    public void select_25EntriesButton() {
        select_25Entries.click();
    }
}
