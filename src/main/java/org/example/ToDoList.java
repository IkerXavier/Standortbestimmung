package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static ArrayList<String> todos = new ArrayList<String>();

    // Die Emojis habe ich von Chat Gpt
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");

        boolean dss = true;
        while (dss) {
            System.out.println("———————————————————————————————————————————————");
            System.out.println("\t       -\uD83D\uDCCBTO DO LIST\uD83D\uDCDD-");
            System.out.println("———————————————————————————————————————————————");
            System.out.println(" \t 1\uFE0F⃣ = Aufgabe hinzufügen  \n \t 2\uFE0F⃣ = Aufgaben Anzeigen \n \t 3\uFE0F⃣ = Aufgaben bearbeiten \n \t 4\uFE0F⃣ = Aufgabe löschen \n \t 5\uFE0F⃣ = Programm beenden \t");
            System.out.println("———————————————————————————————————————————————");
            System.out.println("Geben sie ihre gewünschte Zahl ein(1-5)⭐ :");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    hinzufügen();
                    break;
                case "2":
                    System.out.println(anzeigen(todos));
                    break;
                case "3":
                    bearbeiten();
                    break;
                case "4":
                    löschen();
                    break;
                case "5":
                    beenden();
                    dss = false;
                    break;
            }
        }


    }

    public static ArrayList<String> hinzufügen() {

        Scanner scanner = new Scanner(System.in);
        int liste = 0;
        System.out.println("———————————————————————————————————————————————");
        System.out.println("Fügen sie eine Aufgabe hinzu➕\uD83D\uDCCB :");
        String zahl = scanner.nextLine();
        System.out.println("Deine Aufgabe wurde erfolgreich\uD83D\uDE04der To Do Liste hinzugefügt!");
        todos.add(zahl);
        System.out.println("———————————————————————————————————————————————");
        System.out.println("Drücken sie (Enter) ⏎ um weiterzufahren?");
        zahl = scanner.nextLine();

        return null;
    }

    public static String anzeigen(ArrayList<String> todos) {
        Scanner scanner = new Scanner(System.in);
        int liste = 0;
        String ausgabe = "";
        ausgabe = "\uD83D\uDE0A";
        ausgabe = ausgabe + todos;
        System.out.println("———————————————————————————————————————————————");
        System.out.println("Hier sehen sie alle Aufgaben angezeigt\uD83D\uDE02(Ihre To Do List):");
        System.out.println("Liste: " + todos);
        System.out.println("———————————————————————————————————————————————");
        System.out.println("Drücken sie (Enter) ⏎ um weiterzufahren?");
        String zahl = scanner.nextLine();

        System.out.println("———————————————————————————————————————————————");
        return ausgabe;
    }

    public static void bearbeiten() {
        Scanner scanner = new Scanner(System.in);
        int liste = 0;
        System.out.println("———————————————————————————————————————————————");
        System.out.println("Die wieviellte Aufgabe möchten sie bearbeiten\uD83D\uDE0A(Zahl)?");
        System.out.println("Liste: " + todos);
        int a = scanner.nextInt();
        a = a - 1;
        System.out.println("Was ist die neue Aufgabe➕?");
        String z = scanner.nextLine();
        todos.set(a, z);
        String zahl1 = scanner.nextLine();
        todos.add(zahl1);
        System.out.println("———————————————————————————————————————————————");
        System.out.println("Drücken sie (Enter) ⏎ um weiterzufahren?");
        String zahl = scanner.nextLine();
        System.out.println("———————————————————————————————————————————————");
    }

    public static void löschen() {
        Scanner scanner = new Scanner(System.in);
        int liste = 0;
        System.out.println("———————————————————————————————————————————————");
        System.out.println("Welche Aufgabe möchten sie löschen\uD83D\uDE21:");

        System.out.println("Liste: " + todos);
        String zahl = scanner.nextLine();
        todos.remove(zahl);
        System.out.println("Sie haben erfolgreich✅ etwas aus der Liste entfernt!");
        System.out.println("———————————————————————————————————————————————");
        System.out.println("Drücken sie (Enter) ⏎ um weiterzufahren?");
        zahl = scanner.nextLine();
        System.out.println("———————————————————————————————————————————————");

    }

    public static void beenden() {
        Scanner scanner = new Scanner(System.in);
        int liste = 0;
        System.out.println("———————————————————————————————————————————————");
        System.out.println("Das Programm wird beendet\uD83D\uDE31:");
        System.out.println("\uD83D\uDD1A");
        System.out.println(" ");
        System.out.println("  CCCCC   IIIIII     AAAAA     OOOOO\n" +
                " C     C    II      A     A   O     O\n" +
                "C           II     AAAAAAAA  O       O\n" +
                " C     C    II    A       A   O     O\n" +
                "  CCCCC   IIIIII A         A   OOOOO");

        System.out.println(" ");
        System.out.println("———————————————————————————————————————————————");
    }
}