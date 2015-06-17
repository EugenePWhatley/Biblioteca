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

    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        books = new ArrayList<Book>();
    }

    @Test
    public void shouldPrintBookNameWhenBibliotecaHasOneBook(){
        books.add(new Book("BookOne", "BookName", 1900));
        biblioteca = new Biblioteca(books, printStream);

        biblioteca.printListOfBooks();

        verify(printStream).println("BookName");
    }

    @Test
    public void shouldPrintNothingWhenThereAreNoBooksInBiblioteca(){
        biblioteca = new Biblioteca(books, printStream);

        biblioteca.printListOfBooks();

        verify(printStream).println("");
    }

    @Test
    public void shouldPrintBookNamesWhenThereAreMultipleBooks(){
        books.add(new Book("BookOne", "BookOne", 1900));
        books.add(new Book("BookOne", "BookTwo", 1900));
        biblioteca = new Biblioteca(books, printStream);

        biblioteca.printListOfBooks();

        verify(printStream, times(2)).println(anyString());
    }



}