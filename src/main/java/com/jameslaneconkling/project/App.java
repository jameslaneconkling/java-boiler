package com.jameslaneconkling.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public final class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        logger.info("Hello {}!", "World");
        logger.debug("Doing {}!", "World");
    }
}
