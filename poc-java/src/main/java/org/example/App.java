package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    public static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {

        System.out.println("Hello World!" + null);
        logger.warn("test={}", (Object) null);
    }
}
