package com.amazon.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "D:\\AmazonCucumber\\AmazonProject\\src\\main\\java\\com\\amazon\\features\\SaveForLater.feature", glue = {
		"com.amazon.stepdefinitions" }, monochrome = true, dryRun = false, strict = true)

public class SaveForLaterRunner extends AbstractTestNGCucumberTests {

}
