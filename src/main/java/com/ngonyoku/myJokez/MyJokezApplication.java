package com.ngonyoku.myJokez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyJokezApplication {

    @RequestMapping("/")
    @ResponseBody
    public String greetings() {
        return "Knock Knock!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyJokezApplication.class, args);
    }

}
