package com.edtech.vcm.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final Logger instance = new Logger();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private Logger() {}

    public static Logger getInstance() {
        return instance;
    }

    public void info(String message) {
        log("INFO", message);
    }

    public void error(String message, Throwable throwable) {
        log("ERROR", message);
        throwable.printStackTrace();
    }

    private void log(String level, String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println(timestamp + " [" + level + "] " + message);
    }
}
