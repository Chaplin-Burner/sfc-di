package com.cedriccarre.sfcdi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hello World!";
    }
}
