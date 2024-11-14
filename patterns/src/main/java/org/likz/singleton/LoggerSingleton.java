package org.likz.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerSingleton {

    private static volatile LoggerSingleton logger;

    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
        if (logger == null) {
            synchronized (LoggerSingleton.class) {
                if (logger == null) {
                    logger = new LoggerSingleton();
                }
            }
        }
        return logger;
    }

    public void classLogg(Object obj, String info) {
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yy"));

        System.out.println(today + " - " + obj.getClass().getSimpleName() + " - " + info);
    }

}
