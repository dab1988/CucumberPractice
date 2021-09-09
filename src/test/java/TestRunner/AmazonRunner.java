package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
features={"D:\\ecclipse\\CucumberProject\\FeaturesFile\\order.feature"},
glue={"stepDefinition"},
dryRun=false,
//strict=true,
monochrome=true
)
public class AmazonRunner
{

}
