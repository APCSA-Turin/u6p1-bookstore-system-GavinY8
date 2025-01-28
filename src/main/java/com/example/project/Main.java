package com.example.project;

public class Main {
    public static void main(String[] args) {
        BookStore bruh = new BookStore(); 
        Book b1 = new Book("The Great Gatsby","Scott Fitzgerald", 1925, "979-8351145013",3);
        Book b2 = new Book("The Outliers", "Malcolm Gladwell",2008,"978-0316017930",1);
        Book b3 = new Book("1984", "George Orwell", 1949, "978-0451524935", 5);
        Book b4 = new Book("Brave New World", "Aldous Huxley", 1932, "978-0060850524", 3);
        Book b5 = new Book("Test","Author",1900, "1234", 1);
        bruh.addBook(b1);bruh.addBook(b2);bruh.addBook(b3);bruh.addBook(b4);bruh.addBook(b5);
    }
}
