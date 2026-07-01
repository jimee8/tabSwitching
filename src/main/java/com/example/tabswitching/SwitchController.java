package com.example.tabswitching;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SwitchController {
    @GetMapping("/redirect")
    public String handleRequest(@RequestParam(value = "page", required = false) String page) {
        if ("A".equals(page)) {
            return "redirect:/pageA.html";
        }
        else if ("B".equals(page)) {
            return "redirect:/pageB.html";
        }
        return "redirect:/index.html";
    }

    @GetMapping("/back")
    public String handleBack(){
        return "redirect:/index.html";
    }

    

}
