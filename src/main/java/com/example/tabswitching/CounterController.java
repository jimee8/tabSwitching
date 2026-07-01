package com.example.tabswitching;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CounterController {

    private int count = 0;

    @GetMapping("/api/counter")
    public int getCount(){
        return this.count;
    }

    @PostMapping("/display")
    public int getDisplay(){
        return this.count;
    }

    @PostMapping("/increment")
    public int increment(){
        this.count++;
        return this.count;
    }

    @PostMapping("/decrement")
    public int decrement(){
        this.count--;
        return this.count;
    }

    @PostMapping("/reset")
    public int reset(){
        this.count = 0;
        return this.count;
    }
}
