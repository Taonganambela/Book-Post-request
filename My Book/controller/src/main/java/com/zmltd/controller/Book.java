package com.zmltd.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/create")

public class Book {   

    @PostMapping("/book")
    public Books myBook(@RequestBody Books myBook){
        return myBook;
        
    }

    
}