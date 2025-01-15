package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name;
    private String Id;
    private Book[] book = new Book[5];

    //requires 1 contructor with two parameters that will initialize the name and id
    public User(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String newId) {
        Id = newId;
    }

    public Book[] getBooks() {
        return book;
    }

    public void setBooks(Book[] otherBook) {
        book = otherBook;
    }

    //returns a booklist for the user, if empty, output "empty"
    public String bookListInfo() {
        String str = "";
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                str += "\nempty";
            }
            else {str += "\n" + book[i].bookInfo();}
        }
        str += "\n";
        return str;
    } 

    //returns  "Name: []\nID: []\nBooks:\n[]"
    public String userInfo() {
        String str = "";
        str += "Name: " + name
        + "\nId: " + Id
        + "\nBooks: " + bookListInfo();
        return str;
    } 
       
}