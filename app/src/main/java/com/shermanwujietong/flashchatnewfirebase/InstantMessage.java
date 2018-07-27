package com.shermanwujietong.flashchatnewfirebase;

public class InstantMessage {

    private String author;
    private String message;

    public InstantMessage() {
    }

    public InstantMessage(String author, String message) {
        this.author = author;
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }
}
