package com.booleanuk.core;

public class Article extends SuperPaper {

    Author author;

    public Article(String title, Author author) {
        super(title);
        this.author = author;
    }

    public Article(String title) {
        super(title);
    }

    public Author getAuthor() {
        return author;
    }
}