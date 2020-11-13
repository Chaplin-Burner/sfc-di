package com.cedriccarre.sfcdi;

import com.cedriccarre.sfcdi.controllers.ConstructorInjectedController;
import com.cedriccarre.sfcdi.controllers.MyController;
import com.cedriccarre.sfcdi.controllers.PropertyInjectedController;
import com.cedriccarre.sfcdi.controllers.SetterInjectedController;
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

        System.out.println("---------property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----------setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("--------constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }
}
