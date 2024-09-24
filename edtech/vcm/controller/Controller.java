package com.edtech.vcm.controller;

public interface Controller {
    void addClassroom(String className);
    void addStudent(String studentId, String className);
    void scheduleAssignment(String className, String assignmentDetails);
    void submitAssignment(String studentId, String className, String assignmentDetails);
    void listClassrooms();
    void listStudentsInClassroom(String className);
}
