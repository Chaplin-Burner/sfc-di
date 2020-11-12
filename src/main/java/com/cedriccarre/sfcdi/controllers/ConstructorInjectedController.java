package com.cedriccarre.sfcdi.controllers;

import com.cedriccarre.sfcdi.services.GreetingService;

public class  ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
