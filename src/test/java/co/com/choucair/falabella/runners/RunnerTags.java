package co.com.choucair.falabella.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/falabella.feature",
        tags = "@hu",
        glue = "co.com.choucair.falabella.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {

}