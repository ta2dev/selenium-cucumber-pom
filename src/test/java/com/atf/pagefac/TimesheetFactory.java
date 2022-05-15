package com.atf.pagefac;

import com.atf.Utils;
import com.atf.pages.TimesheetPage;

public class TimesheetFactory extends Utils {

	TimesheetPage tp;

	public TimesheetFactory() {
		tp = init_page(TimesheetPage.class);
	}

	public void verifyTimesheetPage() {
		wait_for_visibility(tp.timesheets);
		attach_currentpage_screenshot("My Timesheets Page");
	}

}
