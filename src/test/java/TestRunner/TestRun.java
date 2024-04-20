package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
					features= {".//FeatureFiles/Login.feature"}, 
					glue="StepDefinitions"
			    )
public class TestRun {

}
