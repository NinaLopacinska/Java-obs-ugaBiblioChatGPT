/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectobslugabibliochatgpt;

import java.util.OptionalDouble;

/**
 *
 * @author 48514
 */
public class RaportGenerator implements IRaport {

    @Override
    public void generujRaport(BazaKsiazek bazaKsiazek) {

        long iloscKsiazke = bazaKsiazek.getKsiazki().stream()
                .filter(x -> x.getTytul().length() > 0)
                .count();
        System.out.println("Ilosc dodanych ksiazke: " + iloscKsiazke);

        System.out.println("Sredni rok wydania to: ");
        OptionalDouble sredniRok = bazaKsiazek.getKsiazki().stream()
                .mapToDouble(Ksiazka::getRokWydania)
                .average();
        System.out.println("Sredni rok wydania to: " + sredniRok);
    }

    @Override
    public void generujRaport(BazaOsob bazaOsob) {
        bazaOsob.getOsoby().stream()
                .forEach(x -> {
                    if (x instanceof Dorosly) {
                        Dorosly dorosly = (Dorosly) x;
                        System.out.println("Dorosly " + dorosly.getImie() + " " + dorosly.getNazwisko());
                    }
                    if( x instanceof Dziecko) {
                    Dziecko dziecko = (Dziecko) x;
                        System.out.println("Dziecko " + dziecko.getImie() + " " + dziecko.getNazwisko());}
                });
    }
}
