package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseStringController {

    @GetMapping(value = "/rev")
    String getReverseString(@RequestParam String text) {
        return text;
    }

}
