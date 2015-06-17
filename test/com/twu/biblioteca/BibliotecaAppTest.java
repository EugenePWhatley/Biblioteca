package com.twu.biblioteca;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class BibliotecaAppTest {

    private BibliotecaApp bibliotecaApp;

    @Test
    public void test() {
        assertEquals(1, 1);
    }


    @Before
    public void setup(){
        bibliotecaApp = new BibliotecaApp();
    }
    
}