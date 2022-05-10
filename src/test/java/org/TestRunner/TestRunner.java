package org.TestRunner;
import org.reports.JsonReports;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class TestRunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(features = { "src\\test\\resources\\pepul.feature" }, glue = {
			"org.testing" }, monochrome = true, dryRun = false, plugin = { "pretty",
					"json:C:\\Users\\ADMIN\\eclipse-workspace\\PepulApp\\JsonReports\\result.json" })
	public static class TestRunner1 {
		@AfterClass
		public static void afterClass() {
			JsonReports.jvmReports("C:\\Users\\ADMIN\\eclipse-workspace\\PepulApp\\JsonReports\\result.json");

		}
}}
