package com.example.hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

/**

add
 */
@Controller
public class MainController {



    @RequestMapping("/users")
    public String index(){
        return "index";
    }
    @RequestMapping("/posts")
    public String posts(ModelMap model){
        //model.addAttribute("massage", "Hello Spring MVC Framework!");
        return "Posts";
    }




}
