package com.zimahaba.angularmongo.controller;

import com.zimahaba.angularmongo.entity.ApplicationUser;
import com.zimahaba.angularmongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public void signUp(@RequestBody ApplicationUser user) {
        userService.signUp(user);
    }
}
