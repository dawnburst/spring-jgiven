package com.tngtech.jgiven.example.springboot;

import com.tngtech.jgiven.example.springboot.dto.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService service;

    @Autowired
    public HelloController( HelloService service ) {
        this.service = service;
    }

    @RequestMapping( "/" )
    public String index() {
        return service.greeting();
    }

    @GetMapping("/test")
    public TestDto test(){
        TestDto testDto = new TestDto();
        testDto.setTestName("Bye");
        testDto.setTestDescription("Hi");

        return testDto;
    }

}