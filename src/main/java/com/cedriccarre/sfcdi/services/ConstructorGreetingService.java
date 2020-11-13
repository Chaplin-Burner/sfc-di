package com.cedriccarre.sfcdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hello World - Constructor";
    }
}
