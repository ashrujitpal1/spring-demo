package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

@GetMapping("/health")
public String health() {
  return "Hello & Welcome to CodeDeply in ASG, being encouraged by Tisya !!!";
}
}