package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Description:
 *
 * @author Aleksanid
 * created 01.11.2020
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
