package com.silvassaOfficer.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FeedBackComplaint {
    WebDriver driver;
    WebDriver ldriver;

    public FeedBackComplaint(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.view.View[@content-desc='Feedbacks / Complaint']")
    @CacheLookup
    private WebElement option_FeedBackComplaint;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")
    @CacheLookup
    private WebElement click_SitesDroddwn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.ListView/android.view.View[2]/android.widget.TextView")
    @CacheLookup
    private WebElement select_Site;
    @FindBy(className = "android.widget.ListView")
    @CacheLookup
    private List<WebElement> siteElements;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton[1]")
    @CacheLookup
    private WebElement option_1DayFeedBackComplaint;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton[2]")
    @CacheLookup
    private WebElement option_1Week_FeedBackComplaint;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton[3]")
    @CacheLookup
    private WebElement option_1Month_FeedBackComplaint;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View")
    @CacheLookup
    private WebElement option_ShowEntries;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.TabWidget/android.view.View[2]")
    @CacheLookup
    private WebElement option_Complaint;

    public void select_FeedBackComplaint() {
        option_FeedBackComplaint.click();
    }

    public void clickon_SitesList() {
        click_SitesDroddwn.click();
    }

    public void clickon_Site() {
        select_Site.click();
    }

    public List<WebElement> getSiteElements() {
        return siteElements;
    }

    public void select_1Day_FeedBackComplaint() {
        option_1DayFeedBackComplaint.click();
    }

    public void select_1Week_FeedBackComplaint() {
        option_1Week_FeedBackComplaint.click();
    }

    public void select_1Month_FeedBackComplaint() {
        option_1Month_FeedBackComplaint.click();
    }

    public void select_ShowEntries() {
        option_ShowEntries.click();
    }

    public void select_Complaint() {
        option_Complaint.click();
    }
}
