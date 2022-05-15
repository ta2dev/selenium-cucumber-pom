package com.atf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class Utils {

	static WebDriver driver;
	static WebDriverWait wait;
	static Scenario scenario;

	public void start_browser(Scenario s) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		wait = new WebDriverWait(driver, Duration.ofMillis(30000));
		scenario = s;
	}

	public void click_element(WebElement element) {
		wait_for_visibility(element).click();
		attach_message_to_scenario("Clicked on " + element, "Clicked Action");
	}

	public void enter_keys(WebElement e, String keys) {
		wait_for_visibility(e).sendKeys(keys);
		attach_message_to_scenario("Entered " + keys + " data in " + e, "Entered Data");
	}

	public WebElement wait_for_visibility(By by) {
		scenario.attach("Wait for Visibility", "text/html", "Element Visible " + by.toString());
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public WebElement wait_for_visibility(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void attach_currentpage_screenshot(String pagename) {
		byte[] data = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(data, "image/png", pagename);
	}

	public void attach_message_to_scenario(String msg, String name) {
		scenario.attach(msg, "text/html", name);
	}

	public <T> T init_page(Class<T> clazz) {
		return PageFactory.initElements(driver, clazz);
	}

	public void tear_down() {
		if (scenario.isFailed()) {
			byte[] data = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(data, "image/png", "Failed Screenshot");
		}
		driver.quit();
	}
}
