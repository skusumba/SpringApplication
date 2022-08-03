package com.dailycodebuffer.springapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String homePage()
    {
        return "Hello World from SpringBoot Application";
    }
}
