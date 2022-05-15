package com.atf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

	@FindBy(xpath = "//*[@id='welcome']")
	public WebElement welcome;

	@FindBy(xpath = "//span[text()='Assign Leave']")
	public WebElement assignLeave;

	@FindBy(xpath = "//span[text()='Leave List']")
	public WebElement leaveList;

	@FindBy(xpath = "//span[text()='My Timesheet']")
	public WebElement timesheets;

}
