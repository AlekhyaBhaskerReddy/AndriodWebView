package com.silvassaOfficer.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteAnalytics_AvgDuration {
    WebDriver driver;
    WebDriver ldriver;

    public SiteAnalytics_AvgDuration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.view.View[@content-desc='Site Analytics']")
    @CacheLookup
    private WebElement option_SiteAnalytics;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")
    @CacheLookup
    private WebElement click_SitesDroddwn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.widget.ListView/android.view.View[2]/android.widget.TextView")
    @CacheLookup
    private WebElement select_Site;
    @FindBy(className = "android.widget.ListView")
    @CacheLookup
    private List<WebElement> siteElements;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.RadioButton[1]")
    @CacheLookup
    WebElement click1D_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.RadioButton[2]")
    @CacheLookup
    WebElement click1W_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.RadioButton[3]")
    @CacheLookup
    WebElement click1M_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.RadioButton[2]")
    @CacheLookup
    WebElement select_4Wheeler;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.RadioButton[1]")
    @CacheLookup
    WebElement select_2Wheeler;

    public void selectSiteAnalytics() {
        option_SiteAnalytics.click();
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

    public void clickonAnalytics_1Doption() {
        click1D_Button.click();
    }

    public void clickonAnalytics_1Woption() {
        click1W_Button.click();
    }

    public void clickonAnalytics_1Moption() {
        click1M_Button.click();
    }

    public void clickon_FourWheeler() {
        select_4Wheeler.click();
    }

    public void clickon_TwoWheeler() {
        select_2Wheeler.click();
    }
}
