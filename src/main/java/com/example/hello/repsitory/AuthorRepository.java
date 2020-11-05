package com.example.hello.repsitory;

import com.example.hello.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
//add
@Repository
public class AuthorRepository {

    public void addAuthor(Author author){
        List<Author> authors = new ArrayList<>();
        authors.add(author);
        System.out.println(authors.toString());
    }
}
