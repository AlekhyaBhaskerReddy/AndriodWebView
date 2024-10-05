package com.silvassaOfficer.pageobject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;

public class DashboardRevenue {
	protected WebDriver ldriver;

	public DashboardRevenue(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.TextView[3]")
	WebElement getInitialRevenue;

	// @FindBy(xpath =
	// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[7]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton[1]")
	// @CacheLookup
	// WebElement click1D_Button;

	@FindBy(xpath = "//android.widget.RadioButton[contains(@text, '1D')]")
	WebElement click1D_Button;

	@FindBy(xpath = "//android.widget.RadioButton[contains(@text, '1W')]")
	WebElement click1W_Button;

	// @FindBy(xpath =
	// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[7]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton[2]")
	// @CacheLookup
	// WebElement click1W_Button;

	@FindBy(xpath = "//android.widget.RadioButton[contains(@text, '1M')]")
	WebElement click1M_Button;

	// @FindBy(xpath =
	// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[7]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton[3]")
	// @CacheLookup
	// WebElement click1M_Button;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View")
	@CacheLookup
	WebElement click_StartEnd_Dates;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.widget.GridView/android.view.View[1]/android.view.View[1]/android.view.View[1]")
	@CacheLookup
	WebElement click_BackWardBtn;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View")
	@CacheLookup
	private WebElement gridView;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.widget.GridView/android.view.View[3]/android.view.View[5]")
	@CacheLookup
	WebElement select_StartDate;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.widget.GridView/android.view.View[1]/android.view.View[1]/android.view.View[3]")
	@CacheLookup
	WebElement click_ForWardBtn;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.widget.GridView/android.view.View[3]/android.view.View[5]")
	@CacheLookup
	WebElement select_EndDate;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.widget.Button[2]")
	@CacheLookup
	WebElement click_ApplyButton;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View")
	@CacheLookup
	WebElement click_ShowEntriesdrpdwnbtn;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
	@CacheLookup
	WebElement select_25Entries;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View")
	private List<WebElement> summaryCards;

	public String getValue() {
		String carddata = getInitialRevenue.getText();
		return carddata;
	}

	public void clickon_1Doption(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(click1D_Button));
		element.click();
		// click1D_Button.click();
	}

	public void clickon_1Woption(WebDriver driver) {
		// click1W_Button.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(click1W_Button));
		element.click();
	}

	public void clickon_1Moption(WebDriver driver) {
		// click1M_Button.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(click1M_Button));
		element.click();
	}

	public void clickon_StartEndDateoOtion() {
		click_StartEnd_Dates.click();
	}

	public void clickon_BackwardOption(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement backwardMonthButton = wait.until(ExpectedConditions.elementToBeClickable(click_BackWardBtn));
		backwardMonthButton.click();
		// click_BackWardBtn.click();
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

	public void click_ShowEntriesDropdwnoption() {
		click_ShowEntriesdrpdwnbtn.click();
	}

	public void select_25EntriesButton() {
		select_25Entries.click();
	}

	public List<String> getSummaryCardNames() {
		List<String> cardNames = new ArrayList<>();
		for (WebElement card : summaryCards) {
			cardNames.add(card.getText());
		}
		return cardNames;
	}

	@SuppressWarnings("deprecation")
	public void scroll_Thepage(WebDriver driver) {
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
						+ "new UiSelector().text(\"Previous\"));"));

	}

}
