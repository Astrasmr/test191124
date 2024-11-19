package com.example.test.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {
    public String sum (Integer x, Integer y) {
        if (x==null || y==null){
            return "Параметр не передан";
        }
        return x + "+" + y + "=" + (x + y);


    }
    public String minus (Integer x, Integer y){
        if (x==null || y==null){
            return "Параметр не передан";
        }
        return String.format("%s-%s=%s",x,y,(x-y));
    }
    public String multiply (Integer x, Integer y) {
        if (x==null || y==null){
            return "Параметр не передан";
        }
        return "%s*%s=%s".formatted(x,y,(x*y));
    }
    public String divide (Integer x, Integer y) {
        if (x==null || y==null){
            return "Параметр не передан";
        }
        if (y==0){
            return  "На ноль делить нельзя";
        }
        return "%s/%s=%s".formatted(x,y,(x/y));
    }

}
