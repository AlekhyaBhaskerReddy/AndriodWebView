package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteReports_Revenue {
    WebDriver driver;
    WebDriver ldriver;

    public SiteReports_Revenue(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.view.View[@content-desc='Site Reports']")
    @CacheLookup
    private WebElement option_SiteReports;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.TextView[2]")
    @CacheLookup
    WebElement getInitialSiteRevenue;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.RadioButton[1]")
    @CacheLookup
    WebElement clickSiteReports1D_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.RadioButton[2]")
    @CacheLookup
    WebElement clickSiteReports1W_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.RadioButton[3]")
    @CacheLookup
    WebElement clickSiteReports1M_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Button")
    @CacheLookup
    WebElement clickonSiteReports_ViewDetails;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[1]")
    @CacheLookup
    WebElement clickonSiteReports_ViewDetails_Csv;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[2]")
    @CacheLookup
    WebElement clickonSiteReports_ViewDetails_Pdf;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.widget.Button")
    @CacheLookup
    WebElement clickonSiteReports_ViewDetails_CloseBtn;

    public void selectSiteReports() {
        option_SiteReports.click();
    }

    public String getValue_SiteRevenue() {
        String carddata = getInitialSiteRevenue.getText();
        return carddata;
    }

    public void selectSiteReports_1Doption() {
        clickSiteReports1D_Button.click();
    }

    public void selectSiteReports_1Woption() {
        clickSiteReports1W_Button.click();
    }

    public void selectSiteReports_1Moption() {
        clickSiteReports1M_Button.click();
    }

    public void selectSiteReports_ViewDetails() {
        clickonSiteReports_ViewDetails.click();
    }

    public void selectSiteReports_ViewDetails_Csv() {
        clickonSiteReports_ViewDetails_Csv.click();
    }

    public void selectSiteReports_ViewDetails_Pdf() {
        clickonSiteReports_ViewDetails_Pdf.click();
    }

    public void selectSiteReports_ViewDetails_CloseBtn() {
        clickonSiteReports_ViewDetails_CloseBtn.click();
    }
}
