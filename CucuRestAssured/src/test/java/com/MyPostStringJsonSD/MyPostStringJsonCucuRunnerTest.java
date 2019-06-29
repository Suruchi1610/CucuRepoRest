package com.MyPostStringJsonSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features={"src/test/resources/com/MyGetRequestFF/"},
		glue={"com/MyGetRequestSD/"}
		
		
		
)

public class MyPostStringJsonCucuRunnerTest {

}
