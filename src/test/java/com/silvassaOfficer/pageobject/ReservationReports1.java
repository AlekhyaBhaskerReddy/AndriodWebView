package com.silvassaOfficer.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReservationReports1 {
    WebDriver driver;
    WebDriver ldriver;
    private WebDriverWait wait;

    public ReservationReports1(WebDriver driver) {
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

    @FindBy(xpath = "//android.view.View[@content-desc='Reservation Reports']")
    @CacheLookup
    private WebElement option_ReservationReports;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")
    @CacheLookup
    private WebElement click_SitesDroddwn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.widget.ListView/android.view.View[2]/android.widget.TextView")
    @CacheLookup
    private WebElement select_Site;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.widget.RadioButton[1]")
    @CacheLookup
    WebElement click1D_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.widget.RadioButton[2]")
    @CacheLookup
    WebElement click1W_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.widget.RadioButton[3]")
    @CacheLookup
    WebElement click1M_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.TextView[1]")
    @CacheLookup
    WebElement click_StartEnd_Dates;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.widget.GridView/android.view.View[1]/android.view.View[1]")
    @CacheLookup
    WebElement click_BackWardBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View")
    @CacheLookup
    private WebElement gridView;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.widget.GridView/android.view.View[3]/android.view.View[5]")
    @CacheLookup
    WebElement select_StartDate;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.widget.GridView/android.view.View[1]/android.view.View[3]")
    @CacheLookup
    WebElement click_ForWardBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.widget.GridView/android.view.View[3]/android.view.View[5]")
    @CacheLookup
    WebElement select_EndDate;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.widget.Button[2]")
    @CacheLookup
    WebElement click_ApplyButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View")
    @CacheLookup
    WebElement click_ShowEntriesdrpdwnbtn;
    // @FindBy(xpath =
    // "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    // @CacheLookup
    // WebElement select_25Entries;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View")
    @CacheLookup
    WebElement click_TransactionType;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    @CacheLookup
    WebElement select_Reservations;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    @CacheLookup
    WebElement select_Passes;

    public void clickon_Menu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(click_Menu));
        click_Menu.click();
    }

    public void waitForPageToLoad() {
        By pageLoadIndicator = By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(pageLoadIndicator));
    }

    public void selectReportsAndAnalytics() {
        option_ReportsAndAnalytics.click();
    }

    public void selectReservationReports() {
        option_ReservationReports.click();
    }

    public void clickon_SitesList() {
        click_SitesDroddwn.click();
    }

    public void clickon_Site() {
        select_Site.click();
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

    public void click_ShowEntriesDropdwnoption() {
        click_ShowEntriesdrpdwnbtn.click();
    }

    // public void select_25EntriesButton() {
    // select_25Entries.click();
    // }

    public void clickon_StartEndDateoOtion() {
        click_StartEnd_Dates.click();
    }

    public void clickon_BackwardOption() {
        click_BackWardBtn.click();
    }

    public void clickon_ForwardOption() {
        click_ForWardBtn.click();
    }

    public WebElement getGridView() {
        return gridView;
    }

    public void clickon_StartDate() {
        select_StartDate.click();
    }

    public void clickon_EndDate() {
        select_EndDate.click();
    }

    public void clickon_ApplyButton() {
        click_ApplyButton.click();
    }

    public void clickon_TransactionType() {
        click_TransactionType.click();
    }

    public void clickon_Reservations() {
        select_Reservations.click();
    }

    public void clickon_Passes() {
        select_Passes.click();
    }
}
