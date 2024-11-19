package com.example.test.controller;

import com.example.test.service.CalculateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping ("/calculate")
@RestController
public class CalculateController {
    private CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping ("/sum")
    public String sum (@RequestParam (value= "x",required = false) Integer x,
                       @RequestParam (value= "y",required = false) Integer y) {
        return calculateService.sum(x, y);
    }
    @GetMapping ("/minus")
    public String minus (@RequestParam (value= "x",required = false) Integer x,
                         @RequestParam (value= "y",required = false) Integer y) {
        return calculateService.minus(x, y);
    }
    @GetMapping ("/privet")
    public String hello () {
        return "Привет, Екатерина";
    }
    @GetMapping ("/multiply")
    public String multiply (@RequestParam (value= "x",required = false) Integer x,
                            @RequestParam (value= "y",required = false) Integer y) {
        return calculateService.multiply(x, y);
    }
    @GetMapping ("/divide")
    public String divide(@RequestParam (value= "x",required = false) Integer x,
                         @RequestParam (value= "y",required = false) Integer y) {
        System.out.println(x+ " " +y);
        return calculateService.divide(x, y);
    }
}
