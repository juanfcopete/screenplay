package com.accenture.screenreto.model;

import java.time.LocalDate;

public class Flight {
    private final String origin;
    private final String destiny;
    private final String date;

    public Flight(String origin, String destiny) {
        this.origin = origin;
        this.destiny = destiny;
        this.date = LocalDate.now().plusDays(1).toString();
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public String getDate() {
        return date;
    }
}
