package com.twu.biblioteca;

/**
 * Created by dlafeir on 6/16/15.
 */
public class Book {
    private String bookName;
    private int year;
    private String author;

    public Book(String bookName, String author, int year) {
        this.bookName = bookName;
        this.author  = author;
        this.year = year;
    }

    public String getDetails() {
        return String.format("%-25s %-25s %d",bookName,author,year);
    }
}