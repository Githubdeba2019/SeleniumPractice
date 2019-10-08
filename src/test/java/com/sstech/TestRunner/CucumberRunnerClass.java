package com.sstech.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", glue="com.sstech.StepDefinition")

public class CucumberRunnerClass {
	
}
