package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {
    ToDoList toDoList;

    @BeforeEach
    void setUp() {
        toDoList = new ToDoList();
    }

    @Test
    void main() {

    }

    @Test
    void hinzufügenTest() {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Hoi");

        assertEquals(1, liste.size());
        assertEquals("Hoi", liste.get(0));
    }

    @Test
    void anzeigenTest() {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("lol");
        liste.add("cool");

        String b = ToDoList.anzeigen(liste);
        String ausgabe = "[lol,cool]";
        assertEquals("[lol, cool]",ToDoList.anzeigen(liste));
    }

    @Test
    void bearbeiten() {
    }

    @Test
    void löschen() {
    }

    @Test
    void beenden() {
    }
}