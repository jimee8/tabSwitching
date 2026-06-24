package com.example.tabswitching;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class NumberController {
    @GetMapping("/api/random")

    public int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(10)+1;
    }
}
