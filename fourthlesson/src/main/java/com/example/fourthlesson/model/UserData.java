package com.example.fourthlesson.model;

public class UserData {

    public static final UserData WRONG_USER = new UserData("error name", "error text");

    private String name;
    private String text;

    public UserData(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public static UserData parsefromJson(String json) {
        return new UserData("Alex", "Hello, I'm Alex");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
