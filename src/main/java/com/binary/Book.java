package com.binary;

import org.w3c.dom.html.HTMLImageElement;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable= true;

    public Book(String title, String author, String isbn, boolean isAvailable){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
