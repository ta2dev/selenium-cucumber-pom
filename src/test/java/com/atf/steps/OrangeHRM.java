package com.atf.steps;

import com.atf.pagefac.DashboardFactory;
import com.atf.pagefac.LeaveFactory;
import com.atf.pagefac.LoginFactory;
import com.atf.pagefac.TimesheetFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM {

	LoginFactory lf = new LoginFactory();
	DashboardFactory df = new DashboardFactory();
	LeaveFactory lvf = new LeaveFactory();
	TimesheetFactory tf = new TimesheetFactory();

	@Given("Login to application using {string} and {string}")
	public void login_to_application_using_and(String username, String passwd) {
		lf.login_into_application(username, passwd);
	}

	@When("Verify the Dashbaord page")
	public void verify_the_dashbaord_page() {
		df.verify_dashboardpage();
	}

	@Then("Click on Assign Leave Button")
	public void click_on_assign_leave_button() {
		df.click_on_assignleave_btn();
	}

	@Then("Verify Assign Leave Page")
	public void verify_assign_leave_page() {
		lvf.verify_assignleave_page();
	}

	@Then("Verify Leave List Page")
	public void verify_leave_list_page() {
		lvf.verify_leavelist_page();
	}

	@Then("Verify Timesheet Page")
	public void verify_timesheet_page() {
		tf.verifyTimesheetPage();
	}

	@Then("Click on Leave List Button")
	public void click_on_leave_list_button() {
		df.click_on_leavelist_btn();
	}

	@Then("Click on My Timesheets Button")
	public void click_on_my_timesheets_button() {
		df.click_on_mytimesheet_btn();
	}

}
