package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by dlafeir on 6/16/15.
 */
public class BibliotecaTest {

    List<Book> books;
    PrintStream printStream;
    Biblioteca biblioteca;
    private String bookOne;
    private String bookOneAuthor;
    private int year;
    private String bookTwo;
    private String bookTwoAuthor;

    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        books = new ArrayList<Book>();
        bookOne = "BookOne";
        bookOneAuthor = "AuthorOne";
        year = 1900;
        bookTwo = "BookTwo";
        bookTwoAuthor = "AuthorTwo";
    }

    @Test
    public void shouldPrintBookNameWhenBibliotecaHasOneBook(){
        books.add(new Book(bookOne, bookOneAuthor, year));
        biblioteca = new Biblioteca(books, printStream);
        String bookOneDetails = String.format("%-25s %-25s %d", bookOne, bookOneAuthor, year);

        biblioteca.printListOfBooks();

        verify(printStream).print(bookOneDetails + "\n");
    }

    @Test
    public void shouldPrintNothingWhenThereAreNoBooksInBiblioteca(){
        biblioteca = new Biblioteca(books, printStream);

        biblioteca.printListOfBooks();

        verify(printStream).print("");
    }

    @Test
    public void shouldPrintBookNamesWhenThereAreMultipleBooks() {
        books.add(new Book(bookOne, bookOneAuthor, year));
        books.add(new Book(bookTwo, bookTwoAuthor, year));
        biblioteca = new Biblioteca(books, printStream);
        String bookOneDetails = String.format("%-25s %-25s %d", bookOne, bookOneAuthor, year);
        String bookTwoDetails = String.format("%-25s %-25s %d", bookTwo, bookTwoAuthor, year);

        biblioteca.printListOfBooks();


        verify(printStream).print(bookOneDetails + "\n" + bookTwoDetails + "\n");
    }



}