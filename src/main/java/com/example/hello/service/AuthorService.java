package com.example.hello.service;

import com.example.hello.model.Author;
import org.springframework.stereotype.Service;

@Service
public interface AuthorService {
    void addAuthor(Author author);
}
