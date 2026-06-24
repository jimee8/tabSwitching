package com.example.tabswitching;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SwitchController {
    @GetMapping("/redirect")
    public String handleRequest(@RequestParam(value = "page", required = false) String page) {
        if ("A".equals(page)) {
            return "redirect:http://127.0.0.1:5500/src/main/resources/static/pageA.html";
        }
        else if ("B".equals(page)) {
            return "redirect:http://127.0.0.1:5500/src/main/resources/static/pageB.html";
        }
        return "redirect:http://127.0.0.1:5500/src/main/resources/static/index.html";
    }

    @GetMapping("/back")
    public String handleBack(){
        return "redirect:http://127.0.0.1:5500/src/main/resources/static/index.html";
    }

    

}
