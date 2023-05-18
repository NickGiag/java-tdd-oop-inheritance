package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    List<Article> articles;
    List<Book> books;
    List<Newspaper> newspapers;

    public Library() {
        this.articles=new ArrayList<>();
        this.books=new ArrayList<>();
        this.newspapers=new ArrayList<>();
    }

    public void addToStock(SuperPaper item) {
        if (item instanceof Article)
            this.articles.add((Article) item);
        if (item instanceof  Book)
            this.books.add((Book)item);
        if (item instanceof  Newspaper)
            this.newspapers.add((Newspaper) item);

    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkIn(SuperPaper item) {
        List<SuperPaper> filtered = getSuperPapers(item);
        

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOut(SuperPaper item) {
        List<SuperPaper> filtered = getSuperPapers(item);

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }
        
        return filtered.get(0).checkOut();
    }
    private List<SuperPaper> getSuperPapers(SuperPaper item) {
        List<SuperPaper> filtered = new ArrayList<>();
        if (item instanceof Article) {
            filtered = this.articles.stream()
                    .filter(article -> article.title.equals(item.title))
                    .collect(Collectors.toList());
        }
        if (item instanceof  Book) {
            filtered = this.books.stream()
                    .filter(book -> book.title.equals(item.title))
                    .collect(Collectors.toList());
        }
        if (item instanceof  Newspaper) {
            filtered = this.newspapers.stream()
                    .filter(newspaper -> newspaper.title.equals(item.title))
                    .collect(Collectors.toList());
        }
        return filtered;
    }
}
