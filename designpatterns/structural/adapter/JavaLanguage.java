package com.designpatterns.structural.adapter;


public class JavaLanguage implements ProgrammingLanguage {
    @Override
    public void executeCode(String code) {
        System.out.println("Executing Java code: " + code);
    }
}
