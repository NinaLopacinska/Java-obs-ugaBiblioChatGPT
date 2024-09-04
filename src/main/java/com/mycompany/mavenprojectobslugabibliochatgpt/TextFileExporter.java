/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectobslugabibliochatgpt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author 48514
 */
public class TextFileExporter implements Exporter {

    @Override
    public void export(List<Ksiazka> ksiazka, String nazwaPliku) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nazwaPliku))) {
            for (Ksiazka x : ksiazka) {
                writer.println("Ksiazka: " + x.getTytul() + " autorstwa " + x.getAutor()
                        + " | wydana w roku: " + x.getRokWydania());

            }
            writer.close();
        }
    }

}
