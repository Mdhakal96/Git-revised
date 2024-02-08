package com.example.firstproject.controller;

import com.example.firstproject.model.StudentDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/login")
    public String StudentDetails(@RequestBody StudentDetails studentDetails){
        System.err.println(studentDetails);
        return "Student first name: " + studentDetails.getFname() + "\n" +
                "Student last name: " + studentDetails.getLname() + "\n" +
                "Student age : " + studentDetails.getAge() + "\n" +
                "Student address name: " + studentDetails.getAddress() + "\n" +
                "Student phone : " + studentDetails.getPhoneNo();

    }
}
