package com.cedriccarre.sfcdi.controllers;

import com.cedriccarre.sfcdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
