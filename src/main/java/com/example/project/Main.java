package com.example.project;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("John",IdGenerate.getCurrentId());
        System.out.println(u1.userInfo());
    }
}
