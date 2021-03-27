package com.accenture.screenreto.stepsdefinitions;

import com.accenture.screenreto.model.Flight;
import com.accenture.screenreto.question.VerifyCheaper;
import com.accenture.screenreto.task.Search;
import com.accenture.screenreto.task.Select;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class SearchFlyStepsDefinition {

    @Before
    public void prepareStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) want to fly$")
    public void cesarWantToFly(String actorName) {
        theActorCalled(actorName).wasAbleTo(Open.url("https://www.vivaair.com/co/es"));
    }

    @When("^choose the fly (.*) - (.*)$")
    public void chooseTheFlyMedellinBogota(String origin, String destiny) {
        theActorInTheSpotlight().attemptsTo(new Search(new Flight(origin,destiny)));
        theActorInTheSpotlight().attemptsTo(new Select(new Flight(origin,destiny)));
    }

    @Then("^i can see the ticket most economic$")
    public void iCanSeeTheTicketMostEconomic() {

        theActorInTheSpotlight().should(seeThat(VerifyCheaper.verifyCost()));
    }


}
