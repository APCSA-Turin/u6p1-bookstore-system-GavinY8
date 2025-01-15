package com.example.project;

public class BookStore {

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books;
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
        for (int i = 1; i < users.length; i++) {
            if (users[i] != null) {
                while (users[i-1] == null) {
                    users[i-1] = users[i];
                    users[i] = null;
                    i -= 1;
                }
            }
        }
    }

    public void addBook(Book book) {

    }

    public void insertBook(Book book, int index) {

    }

    public void removeBook(Book book) {

    }
       
    //you are not tested on this method but use it for debugging purposes
    public String bookStoreBookInfo() {
        return "";
    }

    //you are not tested on this method but use it for debugging purposes
    public String bookStoreUserInfo() {
        return "";
    } 
}