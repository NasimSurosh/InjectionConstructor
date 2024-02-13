package com.example.InjectionConstructor.Controller;

import com.example.InjectionConstructor.ConstructorFolder.InjectionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringControllerClass {

    private InjectionInterface injectionInterface;

    @Autowired
    public SpringControllerClass(InjectionInterface thisInterface){

        injectionInterface = thisInterface;

    }

    @GetMapping("/excercise")
    public String runProgramme(){
        return injectionInterface.injectionInterface1();
    }
}
