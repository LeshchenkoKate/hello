package com.example.hello.model;

import org.springframework.stereotype.Component;

@Component
public class Post {
    private Author author;
    private String content;

    public Post(){
        //пустой конструктор нужен всегда, если ты переопределяешь этот конструктор как-то по своему.
        // Без пустого конструктора спринг не сможет создать бин
        //так же с публичными геттерами и сеттерами - нужны всегда, чтобы спринг не упал
    }
    public Post(Author author, String content) {
        this.author = author;
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
