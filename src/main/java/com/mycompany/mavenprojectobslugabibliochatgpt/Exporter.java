/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenprojectobslugabibliochatgpt;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author 48514
 */
public interface Exporter {
    void export(List<Ksiazka> ksiazka, String nazwaPliku) throws IOException;
}
