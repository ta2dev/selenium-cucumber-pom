package com.atf.pagefac;

import com.atf.Utils;
import com.atf.pages.DashboardPage;

public class DashboardFactory extends Utils {

	DashboardPage dashboardpage;

	public DashboardFactory() {
		dashboardpage = init_page(DashboardPage.class);
	}

	public void verify_dashboardpage() {
		wait_for_visibility(dashboardpage.welcome);
	}

	public void click_on_assignleave_btn() {
		click_element(dashboardpage.assignLeave);
	}

	public void click_on_leavelist_btn() {
		click_element(dashboardpage.leaveList);
	}

	public void click_on_mytimesheet_btn() {
		click_element(dashboardpage.timesheets);
	}
}
