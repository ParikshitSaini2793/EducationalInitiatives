package com.edtech.vcm;

import com.edtech.vcm.controller.ClassroomController;
import com.edtech.vcm.view.ConsoleView;
import com.edtech.vcm.util.InputHandler;
import com.edtech.vcm.util.Logger;

public class VirtualClassroomManager {
    private static final Logger logger = Logger.getInstance();

    public static void main(String[] args) {
        logger.info("Starting Virtual Classroom Manager");
        ClassroomController controller = new ClassroomController();
        ConsoleView view = new ConsoleView();
        InputHandler inputHandler = new InputHandler(controller, view);

        try {
            inputHandler.startInputLoop();
        } catch (Exception e) {
            logger.error("An unexpected error occurred", e);
            view.displayError("An unexpected error occurred. Please check the logs for more information.");
        }

        logger.info("Exiting Virtual Classroom Manager");
    }
}
