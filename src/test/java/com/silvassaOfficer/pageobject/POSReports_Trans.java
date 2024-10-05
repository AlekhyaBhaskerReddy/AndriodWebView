package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POSReports_Trans {
    WebDriver driver;
    WebDriver ldriver;

    public POSReports_Trans(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]")
    @CacheLookup
    WebElement click_POSTransactions;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.TextView[3]")
    @CacheLookup
    WebElement getInitialPOSTransactions;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.RadioButton[1]")
    @CacheLookup
    WebElement click_Trans1DButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.RadioButton[2]")
    @CacheLookup
    WebElement click_Trans1WButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.RadioButton[3]")
    @CacheLookup
    WebElement click_Trans1MButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.view.View")
    @CacheLookup
    WebElement click_TransactionType;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
    @CacheLookup
    WebElement select_EntryType;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    @CacheLookup
    WebElement select_ExitType;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View/android.view.View[3]/android.view.View")
    @CacheLookup
    WebElement click_VehicleType;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    @CacheLookup
    WebElement click_TWO_VehicleType;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View/android.view.View[4]/android.widget.Button")
    @CacheLookup
    WebElement click_TransSubmitBtn;

    public void clickon_POSTransactions() {
        click_POSTransactions.click();
    }

    public String getValue() {
        String carddata = getInitialPOSTransactions.getText();
        return carddata;
    }

    public void clickon_1Doption() {
        click_Trans1DButton.click();
    }

    public void clickon_1Woption() {
        click_Trans1WButton.click();
    }

    public void clickon_1Moption() {
        click_Trans1MButton.click();
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
        click_TransSubmitBtn.click();
    }

}
