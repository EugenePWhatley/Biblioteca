package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.PrintStream;

/**
 * Created by eugenew on 6/18/15.
 */
public class MainMenu {
    private PrintStream printStream;
    private ACAwesomeBufferedReader bufferedReader;

    public MainMenu(PrintStream printStream, ACAwesomeBufferedReader bufferedReader) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public void displayOptions() {
        printStream.println("1. List Books");
    }

    public int getUserInput() {

        String selection = bufferedReader.readLine();

        int selectionAsInt = Integer.parseInt(selection);

        return selectionAsInt;
    }
}
