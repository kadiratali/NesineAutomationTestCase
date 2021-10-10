package runnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;


@CucumberOptions(features = {"src/main/resources/Features/login.feature","src/main/resources/Features/myAccount.feature"},
        plugin = {"cucumberHooks.customReportListener"},
        glue = {"stepDefinition","cucumberHooks"},
        monochrome=true

)
public class RunnerTest extends AbstractTestNGCucumberTests {
    private static Logger log = Logger.getLogger(RunnerTest.class);

    static {

        log.addAppender(new ConsoleAppender(new PatternLayout()));
        log.info("S T A R T ");
        log.info("--------------------------------------------");
        int processors = Runtime.getRuntime().availableProcessors();
        log.info("CPU cores: " + processors);
        log.info("--------------------------------------------");
        log.info("E N D ");
    }

}
