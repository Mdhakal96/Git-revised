package com.example.firstproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mainroot")
public class SecondController {

    @GetMapping("/go/{name}")
    public String stuInfo(@PathVariable ("name") String sName){
        return "Hi student " + sName;
    }

    @GetMapping("/goo/{name}/{age}")
    public String stdinfoo(@PathVariable ("name") String stdName, @PathVariable  ("age") Integer stdage){
        return stdName + " is " + stdage + " Years old.";
    }

    @GetMapping("/PA")
    public String requestParamwork(@RequestParam ("name") String sname, @RequestParam ("address"
    ) String saddress){
        return sname + " Lives in " + saddress;
    }


    @GetMapping("/msg1/go")
    public String test(){
        return "This is testing for second controller";
    }
}
