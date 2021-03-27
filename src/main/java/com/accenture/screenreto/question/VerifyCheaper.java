package com.accenture.screenreto.question;

import com.accenture.screenreto.userinterface.SelectFlight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.xpath.operations.Bool;
import com.accenture.screenreto.task.Select;
import static com.accenture.screenreto.userinterface.SelectFlight.DIV_MOST_CHEAPER;

public class VerifyCheaper implements Question<Boolean> {

    private static boolean isMostCheaper=false;

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean response = false;
        String mostCheaper = DIV_MOST_CHEAPER.resolveFor(actor).getText();
        if (mostCheaper.equalsIgnoreCase(Select.mostCheaper(actor)))
        {
            isMostCheaper=true;
            response = true;
        }
        return response;
    }

    public static Question<Boolean> verifyCost()
    {
        return new VerifyCheaper();
    }
}
