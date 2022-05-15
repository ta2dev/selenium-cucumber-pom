package com.atf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage {

	@FindBy(xpath = "//h1[text()='Leave List']")
	public WebElement leave_list;

	@FindBy(xpath = "//h1[text()='Assign Leave']")
	public WebElement assign_leave;

}
