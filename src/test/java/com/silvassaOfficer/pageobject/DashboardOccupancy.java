package com.silvassaOfficer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;

@SuppressWarnings("deprecation")
public class DashboardOccupancy {
	WebDriver driver;
	WebDriver ldriver;

	public DashboardOccupancy(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]")
	@CacheLookup
	WebElement click_AvgOccupancy;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.TextView[3]")
	@CacheLookup
	WebElement getInitialOccupancy;

	@FindBy(xpath = "//android.widget.RadioButton[1]")
	@CacheLookup
	WebElement clickOccup1D_Button;
	@FindBy(xpath = "//android.widget.RadioButton[2]")
	@CacheLookup
	WebElement clickOccup1W_Button;
	@FindBy(xpath = "//android.widget.RadioButton[3]")
	@CacheLookup
	WebElement clickOccup1M_Button;

	public void clickon_AvgOccupancy() {
		click_AvgOccupancy.click();
	}

	public String getOccupancy() {
		String carddata = getInitialOccupancy.getText();
		return carddata;
	}

	public void clickonAvgOccu_1Doption() {
		clickOccup1D_Button.click();
	}

	public void clickonAvgOccu_1Woption() {
		clickOccup1W_Button.click();
	}

	public void clickonAvgOccu_1Moption() {
		clickOccup1M_Button.click();
	}

	public void scroll_Thepage() {
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
						+ "new UiSelector().text(\"Average Occupancy\"));"));

	}

}
