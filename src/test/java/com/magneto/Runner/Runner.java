package com.magneto.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./features/Mobileitemverify.feature",
		glue={"com/magento/StepDefination"},
		dryRun=false,
		monochrome=true
		
		)


public class Runner {

}
