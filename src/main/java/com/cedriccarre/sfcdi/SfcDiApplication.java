package com.cedriccarre.sfcdi;

import com.cedriccarre.sfcdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * create by cc on 11/12/20
 */

@SpringBootApplication
public class SfcDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfcDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);
    }
}
