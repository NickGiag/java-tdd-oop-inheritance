package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LibraryTest {

    @Test
    void addToStockTest() {
        Library library = new Library();
        SuperPaper article = new Article("Jogn the great");
        SuperPaper newsPaper = new Newspaper("Nick the lazy");
        SuperPaper articleOther = new Article("Whatever");
        articleOther.onLoan = true;

        library.addToStock(article);
        library.addToStock(newsPaper);
        library.addToStock(articleOther);

        Assertions.assertEquals();

    }
}
