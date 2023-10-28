package com.wipro.testcases;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/feature/login.feature" }, dryRun = false, glue = {
		"com.wipro.pages" }, plugin = { "pretty", "json: target/reports.json" }, monochrome = true)
public class TestRunner {

}
