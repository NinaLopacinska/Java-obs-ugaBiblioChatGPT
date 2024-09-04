/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenprojectobslugabibliochatgpt;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 48514
 */
public class MavenprojectObslugaBiblioChatGPT {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BazaOsob bazaOsob = new BazaOsob();
        BazaKsiazek bazaKsiazek = new BazaKsiazek();
        RaportGenerator raportGenerator = new RaportGenerator();
        Exporter exporter = new TextFileExporter();

        System.out.println("Witaj w bibliotece!");
        boolean czyWyjsc = false;

        do {

            System.out.println("Wybierz opcje, ktora Cie interesuje:");
            System.out.println("1. Dodanie nowej książki.");
            System.out.println("2. Dodanie nowego użytkownika.");
            System.out.println("3. Wypożyczenie pozycji.");
            System.out.println("5. Generowanie raportów.");
            System.out.println("6. Eksport danych do pliku tekstowego.");
            System.out.println("7. Zakończenie programu.");

            int nrOpcji = scanner.nextInt();
            if (nrOpcji > 0 || nrOpcji < 8) {

                switch (nrOpcji) {
                    case 1:
                        String tytul;
                        boolean poprawna1 = false;
                        do {
                            System.out.println("Podaj tytul ksiazki:");
                            tytul = scanner.next();
                            if (tytul.equals("") || tytul.length() > 150) {
                                System.out.println("Nieprawidlowa wartosc!");
                            } else {
                                poprawna1 = true;
                            }
                        } while (!poprawna1);

                        String autor;
                        boolean poprawna2 = false;
                        do {
                            System.out.println("Podaj autora ksiazki:");
                            autor = scanner.next();
                            if (autor.equals("") || autor.length() > 100) {
                                System.out.println("Bledna wartosc!");
                            } else {
                                poprawna2 = true;
                            }
                        } while (!poprawna2);

                        String isbn;
                        boolean poprawna3 = false;
                        do {
                            System.out.println("Podaj ISBN ksiazki (13 znakow):");
                            isbn = scanner.next();
                            if (isbn.length() != 13) {
                                System.out.println("Bledna wartosc!");
                            } else {
                                poprawna3 = true;
                            }
                        } while (!poprawna3);

                        int rokWydania;
                        boolean poprawna4 = false;
                        do {
                            System.out.println("Podaj rok wydania ksiazki:");
                            rokWydania = scanner.nextInt();
                            if (rokWydania < 1900 || rokWydania > 2024) {
                                System.out.println("Bledna wartosc!");
                            } else {
                                poprawna4 = true;
                            }
                        } while (!poprawna4);

                        String gatunek;
                        boolean poprawna5 = false;
                        do {
                            System.out.println("Podaj gatunek ksiazki:");
                            gatunek = scanner.next();
                            if (gatunek.equals("")) {
                                System.out.println("Bledna wartosc!");
                            } else {
                                poprawna5 = true;
                            }
                        } while (!poprawna5);

                        Ksiazka ksiazka = new Ksiazka();
                        ksiazka.setTytul(tytul);
                        ksiazka.setAutor(autor);
                        ksiazka.setIsbn(isbn);
                        ksiazka.setRokWydania(rokWydania);
                        ksiazka.setGatunek(gatunek);
                        bazaKsiazek.getKsiazki().add(ksiazka);
                        break;
                    case 2:
                        System.out.println("Dodaj uzytkownika wybierz 1 - osoba dorosla lub 2 - dziecko.");
                        if (scanner.hasNextInt()) {
                            int rodzajOsoby = scanner.nextInt();
                            if (rodzajOsoby == 1) {
                                boolean poprawna6 = false;
                                String imieD;
                                do {
                                    System.out.println("Podaj imie doroslego: ");
                                    imieD = scanner.next();
                                    if (imieD.equals("") || imieD.length() > 50) {
                                        System.out.println("Nieprawidlowa wartosc.");
                                    } else {
                                        poprawna6 = true;
                                    }
                                } while (!poprawna6);

                                boolean poprawna7 = false;
                                String nazwiskoD;
                                do {
                                    System.out.println("Podaj nazwisko doroslego: ");
                                    nazwiskoD = scanner.next();
                                    if (nazwiskoD.equals("") || nazwiskoD.length() > 50) {
                                        System.out.println("Nieprawidlowa wartosc.");
                                    } else {
                                        poprawna7 = true;
                                    }
                                } while (!poprawna7);

                                boolean poprawna8 = false;
                                String pesel;
                                do {
                                    System.out.println("Podaj numer pesel doroslego (11 cyfr): ");
                                    pesel = scanner.next();
                                    if (pesel.length() != 11) {
                                        System.out.println("Nieprawidlowa wartosc.");
                                    } else {
                                        poprawna8 = true;
                                    }
                                } while (!poprawna8);

                                boolean poprawna9 = false;
                                String tytulD;
                                do {
                                    System.out.println("Podaj podaj tytul wypozyczanej ksiazki: ");
                                    tytulD = scanner.next();
                                    if (tytulD.equals("") || tytulD.length() > 150) {
                                        System.out.println("Nieprawidlowa wartosc.");
                                    } else {
                                        poprawna9 = true;
                                    }
                                } while (!poprawna9);

                                Dorosly dorosly = new Dorosly();
                                dorosly.setImie(imieD);
                                dorosly.setNazwisko(nazwiskoD);
                                dorosly.setPesel(pesel);
                                dorosly.setTytulWypozyczany(tytulD);

                                bazaOsob.getOsoby().add(dorosly);
                            } else if (rodzajOsoby == 2) {
                                boolean poprawna10 = false;
                                String imieDzi;
                                do {
                                    System.out.println("Podaj imie dziecka: ");
                                    imieDzi = scanner.next();
                                    if (imieDzi.equals("") || imieDzi.length() > 50) {
                                        System.out.println("Nieprawidlowa wartosc.");
                                    } else {
                                        poprawna10 = true;
                                    }
                                } while (!poprawna10);

                                boolean poprawna11 = false;
                                String nazwiskoDzi;
                                do {
                                    System.out.println("Podaj nazwisko dziecka: ");
                                    nazwiskoDzi = scanner.next();
                                    if (nazwiskoDzi.equals("") || nazwiskoDzi.length() > 50) {
                                        System.out.println("Nieprawidlowa wartosc.");
                                    } else {
                                        poprawna11 = true;
                                    }
                                } while (!poprawna11);

                                boolean poprawna12 = false;
                                int wiek;
                                do {
                                    System.out.println("Podaj wiek dziecka: ");
                                    wiek = scanner.nextInt();
                                    if (wiek < 0 || wiek > 17) {
                                        System.out.println("Nieprawidlowa wartosc.");
                                    } else {
                                        poprawna12 = true;
                                    }
                                } while (!poprawna12);

                                boolean poprawna13 = false;
                                String tytulDzi;
                                do {
                                    System.out.println("Podaj tytul wypozyczanej ksiazki: ");
                                    tytulDzi = scanner.next();
                                    if (tytulDzi.equals("") || tytulDzi.length() > 150) {
                                        System.out.println("Nieprawidlowa wartosc.");
                                    } else {
                                        poprawna13 = true;
                                    }
                                } while (!poprawna13);

                                boolean poprawna14 = false;
                                int wiekMin;
                                do {
                                    System.out.println("Podaj wiek minimalny do wypozyczenia tej ksiazki: ");
                                    wiekMin = scanner.nextInt();
                                    if (wiekMin < 0 || wiekMin > 17) {
                                        System.out.println("Nieprawidlowa wartosc.");
                                    } else {
                                        poprawna14 = true;
                                    }
                                } while (!poprawna14);
                                Dziecko dziecko = new Dziecko();
                                dziecko.setImie(imieDzi);
                                dziecko.setNazwisko(nazwiskoDzi);
                                dziecko.setWiek(wiek);
                                dziecko.setTytulWypozyczany(tytulDzi);
                                dziecko.setWiekMin(wiekMin);

                                if (wiek < wiekMin) {
                                    System.out.println("Dziecko jest za mlode na wypozyczenie tej ksiazki!");
                                } else {
                                    bazaOsob.getOsoby().add(dziecko);
                                }
                            } else {
                                System.out.println("Podaj wartosc 1 - osoba dorosla lub 2 - dla dzieck.");
                            }
                        } else {
                            System.out.println("Podaj wartosc 1 - osoba dorosla lub 2 - dla dzieck.");
                        }
                        break;
                    case 3:
                        System.out.println("Wypozyczone pozycje");

                        for (Osoba x : bazaOsob.getOsoby()) {
                            if (x instanceof Dorosly) {
                                Dorosly d = (Dorosly) x;
                                System.out.println("Dorosly : " + d.getImie() + " " + d.getNazwisko() + d.getTytulWypozyczany());
                            }
                            if (x instanceof Dziecko)
                            {Dziecko dzi  = (Dziecko) x;
                                System.out.println("Dziecko " + dzi.getImie() +" "+ dzi.getNazwisko() +" "+ dzi.getTytulWypozyczany());}
                        }
                        break;

                    case 5:
                        raportGenerator.generujRaport(bazaKsiazek);
                        raportGenerator.generujRaport(bazaOsob);
                        break;
                    case 6:
                        scanner.nextLine();
                        System.out.println("Podaj nazwę pliku do zapisu (np. lista_ksiazke.txt): ");
                        String nazwaPliku = scanner.nextLine();
                        try {
                            exporter.export(bazaKsiazek.getKsiazki(), nazwaPliku);
                            System.out.println("Lista ksiazke została zapisana do pliku: " + nazwaPliku);
                        } catch (IOException e) {
                            System.err.println("Błąd podczas zapisu pliku: " + e.getMessage());
                        }

                        break;
                    case 7:
                        czyWyjsc = true;
                        System.out.println("Do zobaczenia!");
                        break;
                    default:
                        throw new AssertionError();
                }
                System.out.println("Zapraszamy ponownie");

            } else {
                System.out.println("Podaj poprawna opcje z manu!");
            }
        } while (!czyWyjsc);
    }
}
