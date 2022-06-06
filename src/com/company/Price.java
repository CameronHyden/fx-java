package com.company;

import java.sql.Timestamp;
import java.util.Date;

public class Price {
    private int id;
    private String name;
    private int bid;
    private int ask;
    private Timestamp dateCreated;

    public Price(int id, String name, int bid, int ask, Timestamp dateCreated) {
        this.id = id;
        this.name = name;
        this.bid = bid;
        this.ask = ask;
        this.dateCreated = new Timestamp(new Date().getTime());
    }
}
