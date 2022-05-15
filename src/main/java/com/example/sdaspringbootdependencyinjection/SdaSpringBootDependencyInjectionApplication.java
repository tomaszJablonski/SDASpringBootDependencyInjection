package com.example.sdaspringbootdependencyinjection;

import com.example.sdaspringbootdependencyinjection.catAndDog.controller.CatController;
import com.example.sdaspringbootdependencyinjection.catAndDog.controller.DogController;
import com.example.sdaspringbootdependencyinjection.primaryQualifier.controller.ConstructorController;
import com.example.sdaspringbootdependencyinjection.primaryQualifier.controller.PropertyController;
import com.example.sdaspringbootdependencyinjection.primaryQualifier.controller.SetterController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SdaSpringBootDependencyInjectionApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SdaSpringBootDependencyInjectionApplication.class, args);

        ApplicationContext ctx = SpringApplication.run(SdaSpringBootDependencyInjectionApplication.class, args);


        System.out.println("________Property");
        PropertyController propertyController = (PropertyController) ctx.getBean("propertyController");
        System.out.println(propertyController.getGretting());

        System.out.println("________Constructor");
        ConstructorController constructorController = (ConstructorController) ctx.getBean("constructorController");
        System.out.println(constructorController.getGretting());

        System.out.println("________Setter");
        SetterController setterController = (SetterController) ctx.getBean("setterController");
        System.out.println(setterController.getGretting());

        System.out.println("_________Dog");
        DogController dogController = (DogController) ctx.getBean("dogController");
        System.out.println(dogController.getDog());

        System.out.println("_________Cat");
        CatController catController = (CatController) ctx.getBean("catController");
        System.out.println(catController.getCat());

    }

}


