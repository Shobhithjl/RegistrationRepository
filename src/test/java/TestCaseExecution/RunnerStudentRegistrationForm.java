package TestCaseExecution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/resources/Features/StudentRegistrationForm.feature",glue="StudentRegistrationStepDefinition")
public class RunnerStudentRegistrationForm extends AbstractTestNGCucumberTests
{
	

}
