package com.accenture.screenreto.userinterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

public class SelectFlight {
    public static final Target DIV_MOST_CHEAPER = Target.the("Most cheaper flight").locatedBy("//*[@id=\"days-0\"]/button[4]/div[3]");
    public static final Target SELECT_CHEAPER_CARD = Target.the("Select the cheaper plan").locatedBy("//div[@class=\"fare-footer bold viva fare-disabled\"]");
    public static final Target DIV_PRICES = Target.the("Prices for flights").locatedBy("//div[@class=\"from-price\"]");
}
