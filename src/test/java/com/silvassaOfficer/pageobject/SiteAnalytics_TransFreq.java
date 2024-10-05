package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteAnalytics_TransFreq {
    WebDriver driver;
    WebDriver ldriver;

    public SiteAnalytics_TransFreq(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]")
    @CacheLookup
    WebElement clickon_TransactionFrequency;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton[1]")
    @CacheLookup
    WebElement clickTransFreq1W_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton[2]")
    @CacheLookup
    WebElement clickTranFreq1M_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton[3]")
    @CacheLookup
    WebElement clickTransFreq3M_Button;

    public void click_Analytics_TransFreq() {
        clickon_TransactionFrequency.click();
    }

    public void clickonTransFreq_1Woption() {
        clickTransFreq1W_Button.click();
    }

    public void clickonTransFreq_1Moption() {
        clickTranFreq1M_Button.click();
    }

    public void clickonTransFreq_3Moption() {
        clickTransFreq3M_Button.click();
    }
}
