package com.designpatterns.structural.adapter;

public class LanguageDemo {
    public static void main(String[] args) {
        ProgrammingLanguage java = new JavaLanguage();
        ProgrammingLanguage python = new PythonAdapter(new PythonScript());
        
        java.executeCode("System.out.println(\"Hello, Java!\");");
        python.executeCode("print(\"Hello, Python!\")");
    }
}