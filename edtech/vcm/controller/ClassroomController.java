package com.edtech.vcm.controller;

import com.edtech.vcm.model.Classroom;
import com.edtech.vcm.model.Student;
import com.edtech.vcm.model.Assignment;
import com.edtech.vcm.util.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class ClassroomController implements Controller {
    private static final Logger logger = Logger.getInstance();
    private final Map<String, Classroom> classrooms;

    public ClassroomController() {
        this.classrooms = new HashMap<>();
    }

    @Override
    public void addClassroom(String className) {
        if (classrooms.containsKey(className)) {
            throw new IllegalArgumentException("Classroom already exists: " + className);
        }
        classrooms.put(className, new Classroom(className));
        logger.info("Classroom added: " + className);
    }

    @Override
    public void addStudent(String studentId, String className) {
        Classroom classroom = getClassroom(className);
        Student student = new Student(studentId);
        classroom.addStudent(student);
        logger.info("Student " + studentId + " added to classroom: " + className);
    }

    @Override
    public void scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = getClassroom(className);
        Assignment assignment = new Assignment(assignmentDetails);
        classroom.addAssignment(assignment);
        logger.info("Assignment scheduled for classroom: " + className);
    }

    @Override
    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        Classroom classroom = getClassroom(className);
        Student student = classroom.getStudent(studentId);
        Assignment assignment = classroom.getAssignment(assignmentDetails);
        assignment.submitAssignment(student);
        logger.info("Assignment submitted by student " + studentId + " in classroom: " + className);
    }

    @Override
    public void listClassrooms() {
        List<String> classroomNames = new ArrayList<>(classrooms.keySet());
        logger.info("Listing classrooms: " + String.join(", ", classroomNames));
    }

    @Override
    public void listStudentsInClassroom(String className) {
        Classroom classroom = getClassroom(className);
        List<Student> students = classroom.getStudents();
        List<String> studentIds = new ArrayList<>();
        for (Student student : students) {
            studentIds.add(student.getId());
        }
        logger.info("Students in classroom " + className + ": " + String.join(", ", studentIds));
    }

    private Classroom getClassroom(String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new IllegalArgumentException("Classroom not found: " + className);
        }
        return classroom;
    }
}
