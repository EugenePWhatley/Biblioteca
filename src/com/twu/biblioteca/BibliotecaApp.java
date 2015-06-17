package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {


    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Cat In The Hat", "Dr. Seus", 2000));
        books.add(new Book("Life as ThoughtWorker", "Eugene & Raymond", 2015));
        Biblioteca biblioteca = new Biblioteca(books, System.out);
        new BibliotecaApp().run(biblioteca);


    }

    public void run(Biblioteca biblioteca) {
        biblioteca.printWelcomeMessage();
        biblioteca.printListOfBooks();
    }


}