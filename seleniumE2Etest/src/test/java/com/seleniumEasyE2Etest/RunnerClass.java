package com.seleniumEasyE2Etest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)


@CucumberOptions(
		
	features ="src/test/resources/features/seleniumesasyTable.feature",
	plugin = {"pretty", "html:target/cucumber","json:target/json/result.json"},
			tags= {}
		)













public class RunnerClass {

}
