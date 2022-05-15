package com.atf.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources"}, 
		glue= {"com.atf.steps"},
		monochrome = true,
		plugin = {"html:target/test_execution.html"},
		dryRun = false
		)
public class TestRunner {

}
