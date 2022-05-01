package com.abassapp.sfgdi;

import com.abassapp.sfgdi.controller.ConstructorInjectedController;
import com.abassapp.sfgdi.controller.I18nController;
import com.abassapp.sfgdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.getGreeting());

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("------Primary Bean");
        System.out.println(myController.sayHello());

        System.out.println("-------Construct");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }

}
