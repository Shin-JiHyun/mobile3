package com.example.mobile3.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {


    @PostMapping(value = "/signup")
    @ResponseBody
    public String androidResponse(@RequestBody UserData user) {
        System.out.println("Connection from Android");
        System.out.println("Id: "+user.getId()+",  pw: "+user.getPw());

        return "1";

    }
}
