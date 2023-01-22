package org.example;

import org.springframework.stereotype.Component;

@Component
public class FortuneService2 implements FortuneService{
    @Override
    public String getFortune() {
        return "Lucky Day 2!";
    }
}
