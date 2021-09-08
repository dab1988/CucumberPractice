package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
features="FeaturesFile",
glue="stepDefinition",
tags={"@Smoke"},
dryRun=false,
monochrome=true,
strict=true,
plugin="pretty"		
)
public class Runner 
{

}
