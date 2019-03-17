package com.shinzai.formulier.Domain;

public class Form {

    private String email;
    private String question;

    public Form(String email, String question) {

        this.email = email;
        this.question = question;

    }

    public String getEmail() {
        return this.email;
    }

    public String getQuestion() {
        return this.question;
    }

    public String toString() {
        String output = this.email + " asked: \n" + this.question;
        return output;
    }

}

