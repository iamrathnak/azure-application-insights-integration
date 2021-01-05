package com.azure.insights.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class TestController {

private static final Logger logger 
  = LoggerFactory.getLogger(TestController.class);
 @GetMapping("/app/generate-app-log")
    public String getSpanishGreetingById() {
	logger.info("Welcome to azure insights");

        return "Welcome to insights";
    }
}
