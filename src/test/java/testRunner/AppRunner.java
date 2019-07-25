package testRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"."},
plugin ={"pretty", "html:target/cucumber-report"})

public class AppRunner {
	@BeforeClass
	public static void beforeClass() throws Exception {
		BaseClass.before_Class();
	}	
	@AfterClass
	public static void afterClass() throws Exception {
			BaseClass.after_Class();
}
	
}


