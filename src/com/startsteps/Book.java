package com.startsteps;

public class Book {
    String title;
    String author;
    int pages;
    boolean isAvailable;
    static int totalBooks = 0;

    public Book(String title, String author, int pages, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = isAvailable;
        totalBooks++;  // Increment static variable
    }

    public void printBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + isAvailable);
        System.out.println();
    }
    public boolean isThickBook() {
        return pages > 300;
    }
    public static Book findLongestBook(Book[] books) {
        Book longest = books[0];  // Assume the first book is the longest
        for (Book book : books) {
            if (book.pages > longest.pages) {
                longest = book;
            }
        }
        return longest;
    }
}


