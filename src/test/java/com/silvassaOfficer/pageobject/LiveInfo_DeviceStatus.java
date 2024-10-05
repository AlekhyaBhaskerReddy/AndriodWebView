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

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LiveInfo_DeviceStatus {
    WebDriver driver;
    WebDriver ldriver;

    public LiveInfo_DeviceStatus(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.view.View[@content-desc='Device Status']")
    @CacheLookup
    private WebElement option_DeviceStatus;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.widget.ListView/android.view.View[2]/android.widget.TextView")
    @CacheLookup
    private WebElement select_Site;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]")
    @CacheLookup
    WebElement click_DeviceType;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    @CacheLookup
    WebElement select_Device_Barrier;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    @CacheLookup
    WebElement select_Device_Gateway;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]")
    @CacheLookup
    WebElement select_Device_Sensor;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]")
    @CacheLookup
    WebElement select_Device_MobilePrinter;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]")
    @CacheLookup
    WebElement select_Device_Camera;

    public void select_DeviceStatus() {
        option_DeviceStatus.click();
    }

    public void click_SitesDropdown() {
        String dropdownXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button";

        WebElement dropdownButton = driver.findElement(By.xpath(dropdownXPath));
        dropdownButton.click();
    }

    public void click_Site() {
        select_Site.click();
    }

    public void click_DeviceType() {
        click_DeviceType.click();
    }

    public void click_DeviceType_Barrier() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement element = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        element.click();
    }

    public void click_DeviceType_Gateway() {
        select_Device_Gateway.click();
    }

    public void click_DeviceType_Sensor() {
        select_Device_Sensor.click();
    }

    public void click_DeviceType_MobilePrinter() {
        String mobilePrinterText = "Mobile Printer";

        WebElement mobilePrinterElement = driver
                .findElement(By.xpath("//*[contains(@text, '" + mobilePrinterText + "')]"));
        mobilePrinterElement.click();
    }

    public void click_DeviceType_Camera() {
        select_Device_Camera.click();
    }
}
