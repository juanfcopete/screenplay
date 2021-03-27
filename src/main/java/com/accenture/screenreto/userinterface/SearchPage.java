package com.accenture.screenreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SearchPage {
    public static final Target CLOSE_NOTF=Target.the("Close notifications").locatedBy("//*[@id=\"onesignal-slidedown-cancel-button\"]");
    public static final Target SOLO_IDA = Target.the("Solo ida check box").locatedBy("//*[@id=\"criteria\"]/div/div[1]/label/span[1]");
    public static final Target ORIGIN = Target.the("ORIGIN input").locatedBy("//*[@id=\"criteria-airport-select-departure-input\"]");
    public static final Target SELECT_ORIGIN = Target.the("Select origin").locatedBy("//*[@id=\"criteria-airport-select-departure-station-MDE\"]");
    public static final Target DESTINY = Target.the("search destiny").locatedBy("//*[@id=\"criteria-airport-select-destination-input\"]");
    public static final Target SELECT_DEsTINY = Target.the("Select destiny").locatedBy("//*[@id=\"criteria-airport-select-destination-station-BOG\"]");
    public static final Target CLICK_DATE = Target.the("Date for fly").locatedBy("//*[@id=\"criteria-dates-from\"]");
    public static final Target SEARCH_BUTTON = Target.the("Button to search flights").locatedBy("//*[@id=\"criteria-search-button-desktop\"]");
}
