package com.example.InjectionConstructor.ConstructorFolder;

import org.springframework.stereotype.Component;

@Component
public class InjectionEmplement implements InjectionInterface{
    @Override
    public String injectionInterface1() {
        return "This will implement in the page";
    }
}
