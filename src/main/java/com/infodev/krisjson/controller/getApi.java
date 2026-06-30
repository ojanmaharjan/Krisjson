package com.infodev.krisjson.controller;

import com.infodev.krisjson.login.user.validation.LoginRequest;
import com.infodev.krisjson.login.user.validation.RegisterRequest;
import jakarta.validation.Valid;
import lombok.Value;
import org.springframework.web.bind.annotation.*;

/**
 * author: Ojan Maharjan
 * createdDate: 5/25/26
 * projectName: branchless-banking
 **/

@RestController
@RequestMapping("/getApi")
public class getApi {

    @GetMapping()
    public String login(@Valid @RequestBody LoginRequest login){
        return "Hello world";
    }

    @PostMapping("/register")
    public String  userRegister(@Valid @RequestBody RegisterRequest request){
        return null;
    }
}
