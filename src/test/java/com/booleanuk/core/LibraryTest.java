package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    Library library = new Library();
    SuperPaper article = new Article("Jogn the great");
    SuperPaper newsPaper = new Newspaper("Nick the lazy");
    SuperPaper articleOther = new Article("Whatever");

    @Test
    void addToStockTest() {

        articleOther.onLoan = true;

        library.addToStock(article);
        Assertions.assertEquals(1, library.articles.size());

        library.addToStock(newsPaper);
        Assertions.assertEquals(1, library.articles.size());
        Assertions.assertEquals(1, library.newspapers.size());

        library.addToStock(articleOther);
        Assertions.assertEquals(2, library.articles.size());
        Assertions.assertEquals(1, library.newspapers.size());
//        Assertions.assertEquals();

    }
    @Test
    void testCheckout(){
        library.addToStock(article);
        library.addToStock(articleOther);
        articleOther.onLoan = true;
        Assertions.assertEquals("item is not currently on loan",library.checkInArticle(article));
        Assertions.assertEquals("item has been checked in",library.checkInArticle(articleOther));

    }
}
