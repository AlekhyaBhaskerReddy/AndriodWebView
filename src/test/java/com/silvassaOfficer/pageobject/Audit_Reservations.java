package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Audit_Reservations {
    WebDriver driver;
    WebDriver ldriver;

    public Audit_Reservations(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.view.View[@content-desc='Audit Trail']")
    @CacheLookup
    private WebElement option_AuditTrail;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.RadioButton[1]")
    @CacheLookup
    WebElement clickAuditReserve1D_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.RadioButton[2]")
    @CacheLookup
    WebElement clickAuditReserve1W_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.RadioButton[3]")
    @CacheLookup
    WebElement clickAuditReserve1M_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View")
    @CacheLookup
    WebElement clickonTransactionType;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    @CacheLookup
    WebElement select_Reservations;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
    @CacheLookup
    WebElement select_Passes;

    public void select_AuditTrailPage() {
        option_AuditTrail.click();
    }

    public void clickonAuditReserve_1Doption() {
        clickAuditReserve1D_Button.click();
    }

    public void clickonAuditReserve_1Woption() {
        clickAuditReserve1W_Button.click();
    }

    public void clickonAuditReserve_1Moption() {
        clickAuditReserve1M_Button.click();
    }

    public void clickonTransType_ToSelectReservations() {
        clickonTransactionType.click();
    }

    public void select_ReservationsOption() {
        select_Reservations.click();
    }

    public void select_PassesOption() {
        select_Passes.click();
    }
}
