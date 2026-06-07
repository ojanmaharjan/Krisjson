package com.infodev.krisjson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: Ojan Maharjan
 * createdDate: 5/25/26
 * projectName: branchless-banking
 **/

@RestController
@RequestMapping("/getApi")
public class getApi {

    @GetMapping()
    public String getApi(){
        return "Hello world";
    }
}
