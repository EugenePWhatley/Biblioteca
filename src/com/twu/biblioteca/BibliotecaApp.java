package com.twu.biblioteca;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {


    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Cat In The Hat", "Dr. Seus", 2000));
        books.add(new Book("Life as ThoughtWorker", "Eugene & Raymond", 2015));
        Biblioteca biblioteca = new Biblioteca(books, System.out);
        MainMenu mainMenu = new MainMenu(System.out, new ACAwesomeBufferedReader(new InputStreamReader(System.in)));
        new BibliotecaApp().run(biblioteca, mainMenu);


    }

    public void run(Biblioteca biblioteca, MainMenu mainMenu) {
        biblioteca.printWelcomeMessage();
        mainMenu.displayOptions();
        biblioteca.printListOfBooks();

    }


}