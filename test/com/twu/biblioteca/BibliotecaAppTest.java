package com.twu.biblioteca;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class BibliotecaAppTest {

    private BibliotecaApp bibliotecaApp;
    private PrintStream printStream;
    private MainMenu mainMenu;
    private Biblioteca biblioteca;


    @Before
    public void setup(){
        bibliotecaApp = new BibliotecaApp();
        printStream = mock(PrintStream.class);
        mainMenu = mock(MainMenu.class);
        biblioteca = mock(Biblioteca.class);
    }

    @Test
    public void shouldDisplayWelcomeMessageWhenAppRuns(){
        bibliotecaApp.run(biblioteca, mainMenu);

        verify(biblioteca).printWelcomeMessage();
    }

    @Test
    public void shouldDisplayMainMenuOptionsWhenAppRuns() {
        bibliotecaApp.run(biblioteca, mainMenu);

        verify(mainMenu).displayOptions();
    }

}