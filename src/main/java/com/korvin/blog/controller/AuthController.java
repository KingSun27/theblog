package com.korvin.blog.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.korvin.blog.model.User;

@Controller
@RequestMapping("/auth")
public class AuthController {


    
    @RequestMapping(method= RequestMethod.POST)
    @ResponseBody
    int post(@Valid User user) {
    	return 0;
    }
}
