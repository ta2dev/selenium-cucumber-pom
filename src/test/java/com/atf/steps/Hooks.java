package com.atf.steps;

import com.atf.Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * @author <a href="mailto:automationtest.dev@gmail.com">ta2dev</a>
 *         <p>
 *         This is Hooks class used to initialize any methods before and after
 *         scenario.
 *         </p>
 * 
 */

public class Hooks {

	Utils util = new Utils();

	@Before
	public void before_hooks(Scenario s) {
		util.start_browser(s);
	}

	@After
	public void after_hooks() {
		util.tear_down();
	}

}
