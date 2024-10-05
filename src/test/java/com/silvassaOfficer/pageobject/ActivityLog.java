package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ActivityLog {
    WebDriver driver;
    WebDriver ldriver;

    public ActivityLog(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.view.View[@content-desc='User Logs']")
    @CacheLookup
    private WebElement option_UserLogs;

    @FindBy(xpath = "//android.view.View[@content-desc='Activity Log']")
    @CacheLookup
    private WebElement option_ActivityLog;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View")
    @CacheLookup
    private WebElement option_SelectRole;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    @CacheLookup
    private WebElement option_AdminRole;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    @CacheLookup
    private WebElement option_AttenderRole;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.view.View")
    @CacheLookup
    private WebElement option_SelectUser;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    @CacheLookup
    private WebElement option_SilvassaUser;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]")
    @CacheLookup
    private WebElement option_AlekhyaUser;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.RadioButton[1]")
    @CacheLookup
    private WebElement option_1Day;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.RadioButton[2]")
    @CacheLookup
    private WebElement option_1Week;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.RadioButton[3]")
    @CacheLookup
    private WebElement option_1Month;

    public void select_UserLog() {
        option_UserLogs.click();
    }

    public void select_ActivityLog() {
        option_ActivityLog.click();
    }

    public void select_SelectRole() {
        option_SelectRole.click();
    }

    public void select_AdminRole() {
        option_AdminRole.click();
    }

    public void select_AttenderRole() {
        option_AttenderRole.click();
    }

    public void select_SelectUser() {
        option_SelectUser.click();
    }

    public void select_Admin_SilvassaUser() {
        option_SilvassaUser.click();
    }

    public void select_Attender_AlekhyaUser() {
        option_AlekhyaUser.click();
    }

    public void select_Day() {
        option_1Day.click();
    }

    public void select_Week() {
        option_1Week.click();
    }

    public void select_Month() {
        option_1Month.click();
    }
}
