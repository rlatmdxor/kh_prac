package com.kh.app0114;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {

    @GetMapping("/")
    public String m01(){
        return "<h1>root~~~CiCd ~~~</h1>";
    }
}
