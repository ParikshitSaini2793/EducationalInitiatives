package com.edtech.vcm.model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final String name;
    private final List<Student> students;
    private final List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (students.contains(student)) {
            throw new IllegalArgumentException("Student already enrolled in this classroom");
        }
        students.add(student);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public Student getStudent(String studentId) {
        return students.stream()
                .filter(s -> s.getId().equals(studentId))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Student not found: " + studentId));
    }

    public Assignment getAssignment(String assignmentDetails) {
        return assignments.stream()
                .filter(a -> a.getDetails().equals(assignmentDetails))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Assignment not found: " + assignmentDetails));
    }
}
