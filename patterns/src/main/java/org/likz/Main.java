package org.likz;

import org.likz.singleton.AClass;
import org.likz.singleton.LoggerSingleton;

public class Main {

    public static void main(String[] args) {
        // Singleton
        AClass aClass = new AClass();
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.classLogg(aClass, "this is new A-class");

        //Factory
        

    }

}