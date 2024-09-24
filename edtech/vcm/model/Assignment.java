package com.edtech.vcm.model;

import java.util.HashSet;
import java.util.Set;

public class Assignment {
    private final String details;
    private final Set<Student> submittedStudents;

    public Assignment(String details) {
        this.details = details;
        this.submittedStudents = new HashSet<>();
    }

    public String getDetails() {
        return details;
    }

    public void submitAssignment(Student student) {
        submittedStudents.add(student);
    }

    public boolean isSubmittedBy(Student student) {
        return submittedStudents.contains(student);
    }
}