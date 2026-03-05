package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];

        books[0] = new Book();
        books[0].setName("Clean Code");

        books[1] = new Book();
        books[2] = new Book();
        books[3] = new Book();

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                Book book = books[i];
                System.out.println(book.getName() + " : " + book.getPages() + "pages");
            }
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                Book book = books[i];
                System.out.println(book.getName() + " : " + book.getPages() + "pages");
            }
        }

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean Code".equals(book.getName())) {
                System.out.println(book.getName() + " : " + book.getPages() + "pages");
            }
        }
    }
}