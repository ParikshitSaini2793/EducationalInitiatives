package com.edtech.vcm.util;

import com.edtech.vcm.controller.Controller;
import com.edtech.vcm.view.View;

import java.util.Scanner;

public class InputHandler {
    private static final Logger logger = Logger.getInstance();
    private final Controller controller;
    private final View view;
    private final Scanner scanner;

    public InputHandler(Controller controller, View view) {
        this.controller = controller;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void startInputLoop() {
        boolean running = true;
        while (running) {
            try {
                String input = scanner.nextLine().trim();
                if (input.equalsIgnoreCase("exit")) {
                    running = false;
                } else {
                    processInput(input);
                }
            } catch (Exception e) {
                logger.error("Error processing input", e);
                view.displayError("An error occurred while processing your input. Please try again.");
            }
        }
    }

    private void processInput(String input) {
        String[] parts = input.split(" ", 2);
        String command = parts[0].toLowerCase();

        switch (command) {
            case "add_classroom":
                if (parts.length < 2) {
                    view.displayError("Invalid input. Usage: add_classroom <className>");
                    return;
                }
                controller.addClassroom(parts[1]);
                view.displayMessage("Classroom " + parts[1] + " has been created.");
                break;
            case "add_student":
                String[] studentParts = parts[1].split(" ", 2);
                if (studentParts.length < 2) {
                    view.displayError("Invalid input. Usage: add_student <studentId> <className>");
                    return;
                }
                controller.addStudent(studentParts[0], studentParts[1]);
                view.displayMessage("Student " + studentParts[0] + " has been enrolled in " + studentParts[1] + ".");
                break;
            case "schedule_assignment":
                String[] scheduleParts = parts[1].split(" ", 2);
                if (scheduleParts.length < 2) {
                    view.displayError("Invalid input. Usage: schedule_assignment <className> <assignmentDetails>");
                    return;
                }
                controller.scheduleAssignment(scheduleParts[0], scheduleParts[1]);
                view.displayMessage("Assignment for " + scheduleParts[0] + " has been scheduled.");
                break;
            case "submit_assignment":
                String[] submitParts = parts[1].split(" ", 3);
                if (submitParts.length < 3) {
                    view.displayError("Invalid input. Usage: submit_assignment <studentId> <className> <assignmentDetails>");
                    return;
                }
                controller.submitAssignment(submitParts[0], submitParts[1], submitParts[2]);
                view.displayMessage("Assignment submitted by Student " + submitParts[0] + " in " + submitParts[1] + ".");
                break;
            case "list_classrooms":
                controller.listClassrooms();
                break;
            case "list_students":
                if (parts.length < 2) {
                    view.displayError("Invalid input. Usage: list_students <className>");
                    return;
                }
                controller.listStudentsInClassroom(parts[1]);
                break;
            default:
                view.displayError("Unknown command: " + command);
        }
    }
}