package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class SampleController {
	@GetMapping("/hello")
    public String hello() {
        return "I am Deploying the docker images!";
        
	}}