/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectobslugabibliochatgpt;

/**
 *
 * @author 48514
 */
public abstract class Osoba {

    private String imie;
    private String nazwisko;
    private String tytulWypozyczany;
    private int wiekMin;
    
    public int getWiekMin() {
        return wiekMin;
    }

    public void setWiekMin(int wiekMin) {
        this.wiekMin = wiekMin;
    }
    

    public String getTytulWypozyczany() {
        return tytulWypozyczany;
    }

    public void setTytulWypozyczany(String tytulWypozyczany) {
        this.tytulWypozyczany = tytulWypozyczany;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

}
