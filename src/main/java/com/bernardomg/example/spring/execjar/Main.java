
package com.bernardomg.example.spring.execjar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public Main() {
        super();
    }

    public static void main(final String[] args) {
        LOGGER.info("Executed correctly");
    }

}
