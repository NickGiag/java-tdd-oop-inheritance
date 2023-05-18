package com.booleanuk.core;

public class Book extends SuperPaper {

    Author author;

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }

    public Book(String title) {
        super(title);
    }

    public Author getAuthor() {
        return author;
    }
}
