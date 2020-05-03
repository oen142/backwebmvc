package com.backwebmvc.backwebmvc.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hellos")
    public String hello(){
        return "hellos";
    }

    @PostMapping("/users/create")
    // RestController 는 @ResponseBody 생략가능 반대는 무조건 바디를 써야함
    public @ResponseBody User create(@RequestBody User user){
//컴포지션 타입 (객체일때)
        return user;
    }
}
