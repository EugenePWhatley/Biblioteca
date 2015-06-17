package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by eugenew on 6/17/15.
 */
public class BookTest {

    @Test
    public void shouldPrintAuthorWhenBookDetailsIsCalled(){
        Book book = new Book("BookOne", "Dr. Seus", 1900);

        assertThat(book.getDetails(), is("BookOne Dr. Seus 1900"));
    }

}