package org.likz.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerSingleton {

    private LoggerSingleton() {
    }

    private static class HolderSingletom {
        private static final LoggerSingleton INSTANCE = new LoggerSingleton();
    }

    public static LoggerSingleton getInstance() {
        return HolderSingletom.INSTANCE;
    }

    public void classLogg(Object obj, String info) {
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yy"));

        System.out.println("Log info: " + today + " - " + obj.getClass().getSimpleName() + " - " + info);
    }

}
