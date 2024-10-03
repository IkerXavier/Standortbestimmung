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
        ArrayList list = toDoList.hinzufügen();

        list.add("lol");
        assertEquals("lol", list.add(list.get(0)));
    }

    @Test
    void anzeigenTest() {
        toDoList.todos.add("lol");
        assertEquals("lol", toDoList.todos.get(0));
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