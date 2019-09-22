package com.mix;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Artur",15,'m');
        Osoba osoba2 = new Osoba("Basia",30 ,'k');
        Osoba osoba3 = new Osoba("Paweł",20,'m');
        Osoba osoba4 = new Osoba("Kasia",25,'k');
        Osoba osoba5 = new Osoba("Marcin",101,'m');

        new ArrayList<>();


        System.out.println("Lista osób: "+ "\n" + osoba.getImię() + ", wiek " + osoba.getWiek()
                + "\n" + osoba2.getImię() + ", wiek " + osoba2.getWiek()
                + "\n" + osoba3.getImię() + ", wiek " + osoba3.getWiek()
                + "\n" + osoba4.getImię() + ", wiek " + osoba4.getWiek()
                + "\n" + osoba5.getImię() + ", wiek " + osoba5.getWiek());
    }
}
