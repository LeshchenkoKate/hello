package com.example.hello.controllers;
import com.example.hello.model.Author;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//add

@Controller
@RequestMapping("/")
public class AuthorController {
    private static final Logger logger = LoggerFactory.getLogger(AuthorController.class);

    @RequestMapping(value="/author", method = RequestMethod.GET)
    public ModelAndView getAuthorPage(){
        return new ModelAndView("author", "author", new Author());
    }


    @RequestMapping(value = "/addAuthor", method = RequestMethod.POST)
    public String addAuthor(@ModelAttribute("author")Author author, BindingResult result, ModelMap model){
        if(result.hasErrors()) System.out.println("error");
        model.addAttribute("nick", author.getNick());
        logger.error("error");

        return "redirect:createPost";
    }
}
