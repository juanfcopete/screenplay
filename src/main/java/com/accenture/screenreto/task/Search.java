package com.accenture.screenreto.task;

import com.accenture.screenreto.model.Flight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.accenture.screenreto.userinterface.SearchPage.*;

public class Search implements Task {
    private Flight fly;
    private String price;

    public Search(Flight flight) {
        fly=flight;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(CLOSE_NOTF),
        Click.on(SOLO_IDA),
        Enter.theValue(fly.getOrigin()).into(ORIGIN),
        Click.on(SELECT_ORIGIN),
        Enter.theValue(fly.getDestiny()).into(DESTINY),
        Click.on(SELECT_DEsTINY),
        Click.on(CLICK_DATE),
        Click.on("//button[@date=\""+fly.getDate()+"\"]"),
        Click.on(SEARCH_BUTTON));
    }
}
