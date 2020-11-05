package com.example.hello.service.impl;

import com.example.hello.model.Author;
import com.example.hello.repsitory.AuthorRepository;
import com.example.hello.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//add
@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    AuthorRepository authorRepo;
    @Override
    public void addAuthor(Author author) {
        if(author!=null)
            authorRepo.addAuthor(author);

    }
}
