package com.atf.pagefac;

import com.atf.Utils;
import com.atf.pages.LoginPage;

public class LoginFactory extends Utils {

	LoginPage login;

	public LoginFactory() {
		login = init_page(LoginPage.class);
	}

	public void login_into_application(String uname, String pwd) {

		attach_currentpage_screenshot("Orange HRM Login Page");
		// Enter username and password
		enter_keys(login.username, uname);
		enter_keys(login.password, pwd);
		// Click on Login Button
		click_element(login.loginBtn);
	}

	public void verify_forgot_passwordLink() {

		// Verify forgot password link is visible
		wait_for_visibility(login.forgotPasswordLink);
	}

}
