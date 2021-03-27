package com.accenture.screenreto.task;

import com.accenture.screenreto.model.Flight;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.accenture.screenreto.userinterface.SelectFlight.*;

public class Select implements Task {
    private Flight flight;
    public Select(Flight flight) {
        this.flight=flight;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(" //div[@class=\"from-price\"][ text() = \""+mostCheaper(actor)+"\"]"),
                Click.on(SELECT_CHEAPER_CARD)
                );
    }

    public static String mostCheaper (Actor actor)
    {
        String temp;
        //List<String> pricesString= new ArrayList<>();
        List<WebElementFacade> prices = DIV_PRICES.resolveAllFor(actor);
        String mostCheaper=prices.get(0).getText();
        for (int i = 0; i < prices.size(); i++){
            //pricesString.add(price.getText().replace("COP","").replace(",","").replace(" ",""));
            temp=prices.get(i).getText();
            if (mostCheaper.compareTo(temp)<0 || mostCheaper.compareTo(temp)==0)
            {
                mostCheaper=mostCheaper;
            }else {
                mostCheaper=temp;
            }
        }
        System.out.println(mostCheaper);
        return mostCheaper;
    }

}
