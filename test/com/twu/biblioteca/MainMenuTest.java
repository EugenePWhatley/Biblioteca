package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by eugenew on 6/18/15.
 */
public class MainMenuTest {

    private MainMenu menu;
    private PrintStream printStream;
    private ACAwesomeBufferedReader bufferedReader;

    @Before
    public void setUp(){
        bufferedReader = mock(ACAwesomeBufferedReader.class);
        printStream = mock(PrintStream.class);
        menu = new MainMenu(printStream, bufferedReader);
    }

    @Test
    public void shouldDisplayOptionListBooksWhenDisplayOptionsIsCalled(){
        menu.displayOptions();

        verify(printStream).println("1. List Books");
    }

    @Test
    public void shouldReturnOneWhenUserInputsOne() {
        when(bufferedReader.readLine()).thenReturn("1");

        int selection = menu.getUserInput();

        assertEquals(selection, 1);
    }
}
