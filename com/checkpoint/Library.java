package com.checkpoint;

import java.util.ArrayList;
import java.util.List;

public class Library {
        List<String> books = new ArrayList<>();
    public Library() {

    }
    public void addBook(String book){
        books.add(book);
    }

    public static void main(String[] args){
        Library library = new Library();
        library.addBook("Java programming");
        library.addBook("Data Structures");
        library.addBook("Linux administration");

        for (String book : library.books) {
            System.out.println(book);
        }
    }

}
