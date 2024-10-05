package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POSAttender {
    WebDriver driver;
    WebDriver ldriver;

    public POSAttender(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Attender Usage in POS Reports
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]")
    @CacheLookup
    WebElement click_POSAttenderUsage;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.TextView[3]")
    @CacheLookup
    WebElement getInitialPOSAttenderUsage;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.RadioButton[1]")
    @CacheLookup
    WebElement click_Attender1DButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.RadioButton[2]")
    @CacheLookup
    WebElement click_Attender1WButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.RadioButton[3]")
    @CacheLookup
    WebElement click_Attender1MButton;

    // Attender Usage
    public void clickon_POSAttender() {
        click_POSAttenderUsage.click();
    }

    public String getValue_Attender() {
        String carddata = getInitialPOSAttenderUsage.getText();
        return carddata;
    }

    public void clickon_Attender1Doption() {
        click_Attender1DButton.click();
    }

    public void clickon_Attender1Woption() {
        click_Attender1WButton.click();
    }

    public void clickon_Attender1Moption() {
        click_Attender1MButton.click();
    }
}
