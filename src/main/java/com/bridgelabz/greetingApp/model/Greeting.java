package com.bridgelabz.greetingApp.model;

import javax.persistence.*;

@Entity
//@Table(name = "greet")
public class Greeting {
    @Id
    private int id;
    private String message;

    public Greeting(String message) {
        this.message = message;
    }

    public Greeting(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String name) {
        this.message = name;
    }
}