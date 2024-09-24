package com.designpatterns.structural.adapter;

public class PythonAdapter implements ProgrammingLanguage {
    private PythonScript pythonScript;

    public PythonAdapter(PythonScript pythonScript) {
        this.pythonScript = pythonScript;
    }

    @Override
    public void executeCode(String code) {
        pythonScript.runScript(code);
    }
}
