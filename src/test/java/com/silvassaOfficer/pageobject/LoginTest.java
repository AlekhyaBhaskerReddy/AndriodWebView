package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
    WebDriver driver;
    WebDriver ldriver;

    public LoginTest(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")
    @CacheLookup
    WebElement txtUserName;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")
    @CacheLookup
    WebElement txtpassword;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button")
    @CacheLookup
    WebElement btnLogin;

    public void setusername(String uname) {
        txtUserName.sendKeys(uname);
    }

    public void setpassword(String pwd) {
        txtpassword.sendKeys(pwd);
    }

    public void clickSubmit() {
        btnLogin.click();
    }

}
