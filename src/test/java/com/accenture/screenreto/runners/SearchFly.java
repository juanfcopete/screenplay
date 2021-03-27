package com.accenture.screenreto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_fly.feature",
        glue = "com.accenture.screenreto.stepsdefinitions",
        snippets = SnippetType.CAMELCASE)
public class SearchFly {
}
