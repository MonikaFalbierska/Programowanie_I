package com.mix;

public class Osoba {
    private String imię;
    private int wiek;
    private char sex;


    public Osoba(String imię, int wiek, char sex) {
        this.imię = imię;
        this.wiek = wiek;
        this.sex = sex;


    }

    public String getImię() {
        return imię;
    }

    public int getWiek() {
        return wiek;
    }
}
