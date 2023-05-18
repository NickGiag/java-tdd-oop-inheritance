package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SuperPaperTest {

    @Test
    public void shouldCheckOutIfAvailable() {
        SuperPaper superPaper = new SuperPaper("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", superPaper.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        SuperPaper superPaper = new SuperPaper("JUnit Rocks");
        superPaper.checkOut();

        Assertions.assertEquals("item is currently on loan", superPaper.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        SuperPaper superPaper = new SuperPaper("JUnit Rocks");
        superPaper.checkOut();

        Assertions.assertEquals("item has been checked in", superPaper.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        SuperPaper superPaper = new SuperPaper("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", superPaper.checkIn());
    }
}
