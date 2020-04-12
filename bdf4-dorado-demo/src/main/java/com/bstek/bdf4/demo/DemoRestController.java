package com.bstek.bdf4.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DemoRestController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}