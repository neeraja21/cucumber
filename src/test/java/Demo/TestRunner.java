package Demo;

import org.junit.runner.RunWith;
//import org.junit.experimental.theories.suppliers.TestedOn;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\A08019DIRP_C2B.02.14\\CUCUMBER\\src\\resources\\java\\cucumber\\sample.Feature",plugin= {"html:target/Reports"})
public class TestRunner {
	
}

