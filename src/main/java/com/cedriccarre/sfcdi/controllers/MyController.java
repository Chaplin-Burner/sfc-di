package com.cedriccarre.sfcdi.controllers;

import com.cedriccarre.sfcdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * create by cc on 11/12/20
 */

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }

}
