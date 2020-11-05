package com.example.hello.model;

import org.springframework.stereotype.Component;

@Component
public class Author {
    private String nick;

    public Author(){}

    public Author(String nick){
        this.nick=nick;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
