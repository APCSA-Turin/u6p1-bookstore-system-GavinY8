package com.example.project;

public class BookStore {

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books = new Book[5];
    private User[] users = new User[10];


    //requires 1 empty constructor
    public BookStore() {}

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] newUsers) {
        users = newUsers;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            //looks for the first avaliable empty index
            if (users[i] == null) {
                //sets empty index to user
                users[i] = user;
                break;
            }
        }
    } 

    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            //check each index for a matching user
            if (users[i] == user) {
                // end loop after user is removed
                users[i] = null;
                consolidateUsers();
                break;
            }
        }
    }

    public void consolidateUsers() {
        User[] brih = users;
        for (int i = 0; i < users.length-1; i++) {
            //checks if the index in front is not null
            if (brih[i+1] != null) {
                //while the index is null set current index to the index in front then set the front to null
                while (brih[i] == null) {
                    brih[i] = brih[i+1];
                    brih[i+1] = null;
                    //makes sure the loop doesnt go out of bounds
                    if (i != 0) {
                        i -= 1;
                    }
                }
            }
        }
        users = brih;
    }

    public void consolidateBooks() {
        for (int i = 0; i < books.length-1; i++) {
            //checks if the index in front is not null
            if (books[i+1] != null) {
                //while the index is null set current index to the index in front then set the front to null
                while (books[i] == null) {
                    books[i] = books[i+1];
                    books[i+1] = null;
                    //makes sure the loop doesnt go out of bounds
                    if (i != 0) {
                        i -= 1;
                    }
                }
            }
        }
    }

    public void addBook(Book book) {
        Book[] qwe = books;
        //looks for the first avaliable empty index
        for (int i = 0; i < qwe.length; i++) {
            if (qwe[i] == null) {
                //sets empty index to book
                qwe[i] = book;
                break;
            }
        }
        books = qwe;
    }

    public void insertBook(Book book, int index) {
        //moves all books in front of the desired index up by one
        for (int i = books.length-1; i > index; i--) {
            books[i] = books[i-1];
        }
        books[index] = book;
    }

    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            //if the book is avaliable lower quantity by one
            if (books[i] == book) {
                books[i].setQuantity(books[i].getQuantity()-1);
            }
            //if quantity drops to 0, set the missing book to null, consolidate the array, then set books to a new list without the null
            if (books[i].getQuantity() == 0) {
                books[i] = null;
                consolidateBooks();
                Book[] qwe = new Book[books.length-1];
                for (int j = 0; j < qwe.length; j++) {
                    qwe[j] = books[j];
                }
                books = qwe;
            }
        }
    }
       
    //you are not tested on this method but use it for debugging purposes
    public String bookStoreBookInfo() {
        String str = "";
        for (int i = 0; i < books.length; i++) {
            str += books[i].bookInfo() + "\n";
        }
        return str;
    }

    //you are not tested on this method but use it for debugging purposes
    public String bookStoreUserInfo() {
        return "";
    } 
}