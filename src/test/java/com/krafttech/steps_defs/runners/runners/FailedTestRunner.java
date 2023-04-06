package com.krafttech.steps_defs.runners.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/failed-html-reports"
        },
        features = "@target/rerun.txt",
        glue ="com/krafttech/steps_defs"
)
public class FailedTestRunner {
}
