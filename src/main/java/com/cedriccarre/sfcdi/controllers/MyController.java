package com.cedriccarre.sfcdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * create by cc on 11/12/20
 */

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("hello world!!");

        return "Hi folks!";
    }

}
