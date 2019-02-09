package io.github.n3roo.engine;

import io.github.n3roo.graphics.Renderer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NeroEngine {

    private static final Logger LOGGER = LogManager.getLogger(NeroEngine.class.getName());

    public static void start(){
        LOGGER.info("Starting renderer");
        Renderer.init();

        LOGGER.info("Starting gameloop");
        GameLoop.start();
    }
}