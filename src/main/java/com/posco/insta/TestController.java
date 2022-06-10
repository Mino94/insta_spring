package com.posco.insta;

import org.springframework.web.bind.annotation.*;


@RestController
public class TestController {
    @GetMapping("/")
    public String Test(){
        return "test";
    }

}
