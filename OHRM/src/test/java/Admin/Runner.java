package Admin;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\RASACHIN\\Desktop\\CucumberSprint2\\OHRM\\src\\test\\resources\\Features\\User.feature",glue= {"Admin"},
monochrome = true,
plugin={"pretty","junit:target/JunitReports/report2.xml",
		"json:target/JSONReports/report2.json",
		"html:target/HTMLreport2"}

)

public class Runner {

}
