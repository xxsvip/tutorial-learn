package vip.xingxiaoshuai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vip.xingxiaoshuai.controller.domain.User;

@RestController
public class TestController {

    @GetMapping("/get")
    public String get(){
        return "哈喽，Spring Boot get";
    }

    @PostMapping("/post")
    public String post(){
        return "哈喽，Spring Boot post";
    }

    @GetMapping("/get2")
    public String get2(String email){
        return email;
    }

    @PostMapping("/post2")
    public User post2(@RequestBody User user){
        return user;
    }

    @GetMapping("/get3")
    public String get3(String email){
        return email;
    }

}
