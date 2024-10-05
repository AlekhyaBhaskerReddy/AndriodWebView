package com.silvassaOfficer.pageobject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;

public class POSReports_Revenue {
    WebDriver driver;
    WebDriver ldriver;
    private WebDriverWait wait;

    public POSReports_Revenue(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button")
    @CacheLookup
    private WebElement click_Menu;

    @FindBy(xpath = "//android.view.View[@content-desc='Reports & Analytics']")
    @CacheLookup
    private WebElement option_ReportsAndAnalytics;

    @FindBy(xpath = "//android.view.View[@content-desc='Pos Reports']")
    @CacheLookup
    private WebElement option_POSReports;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")
    @CacheLookup
    private WebElement click_SitesDroddwn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.widget.ListView/android.view.View[2]/android.widget.TextView")
    @CacheLookup
    private WebElement select_Site;
    @FindBy(className = "android.widget.ListView")
    @CacheLookup
    private List<WebElement> siteElements;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.Button")
    @CacheLookup
    private WebElement click_POSDroddwn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.widget.ListView/android.view.View[1]/android.widget.TextView")
    @CacheLookup
    private WebElement select_POSDevice;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.TextView[3]")
    @CacheLookup
    WebElement getInitialPOSRevenue;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.widget.RadioButton[1]")
    @CacheLookup
    WebElement click1D_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.widget.RadioButton[2]")
    @CacheLookup
    WebElement click1W_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.widget.RadioButton[3]")
    @CacheLookup
    WebElement click1M_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.view.View")
    @CacheLookup
    WebElement click_TransactionType;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
    @CacheLookup
    WebElement select_EntryType;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    @CacheLookup
    WebElement select_ExitType;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[3]/android.view.View")
    @CacheLookup
    WebElement click_VehicleType;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    @CacheLookup
    WebElement click_TWO_VehicleType;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.Button")
    @CacheLookup
    WebElement click_SubmitBtn;

    public void clickon_Menu() {
        click_Menu.click();
    }

    public void selectReportsAndAnalytics() {
        option_ReportsAndAnalytics.click();
    }

    public void selectPOSReports() {
        option_POSReports.click();
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

    public void clickon_POSList() {
        click_POSDroddwn.click();
    }

    public void clickon_POSDevice() {
        select_POSDevice.click();
    }

    public String getValue() {
        String carddata = getInitialPOSRevenue.getText();
        return carddata;
    }

    public void clickon_1Doption() {
        click1D_Button.click();
    }

    public void clickon_1Woption() {
        click1W_Button.click();
    }

    public void clickon_1Moption() {
        click1M_Button.click();
    }

    public void clickon_TransactionType() {
        click_TransactionType.click();
    }

    public void clickon_EntryTransaction() {
        select_EntryType.click();
    }

    public void clickon_ExitTransaction() {
        select_ExitType.click();
    }

    public void clickon_VehicleType() {
        click_VehicleType.click();
    }

    public void select_TWO_VehicleType() {
        click_TWO_VehicleType.click();
    }

    public void clickon_SubmitBtn() {
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(click_SubmitBtn));
        submitButton.click();
    }

    @SuppressWarnings("deprecation")
    public void scrollUP_Thepage() {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().text(\"POS Reports\"));"));

    }
}
