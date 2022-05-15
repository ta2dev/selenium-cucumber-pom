package com.atf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath = "//*[@id=\"txtUsername\"]")
	public WebElement username;

	@FindBy(xpath = "//*[@id=\"txtPassword\"]")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	public WebElement loginBtn;

	@FindBy(xpath = "//*[text()=\"Forgot your password?\"]")
	public WebElement forgotPasswordLink;

}
