package com.mcx.blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class frontpage {
    @GetMapping("/index")
    public String text(){
        return "/front/html/index";
    }
}
