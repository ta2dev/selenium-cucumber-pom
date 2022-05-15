package com.atf.pagefac;

import com.atf.Utils;
import com.atf.pages.LeavePage;

public class LeaveFactory extends Utils {

	LeavePage lp;

	public LeaveFactory() {
		lp = init_page(LeavePage.class);
	}

	public void verify_assignleave_page() {
		wait_for_visibility(lp.assign_leave);
	}

	public void verify_leavelist_page() {
		wait_for_visibility(lp.leave_list);
		attach_currentpage_screenshot("Leave List Page");
	}

}
