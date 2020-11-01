package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author Aleksanid
 * created 01.11.2020
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
