
package com.bernardomg.example.spring.execjar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entry. This is what makes the project executable.
 * <p>
 * All it does is printing to the log.
 *
 * @author Bernardo Mart&iacute;nez Garrido
 *
 */
public class Main {

    /**
     * Logger for the class.
     */
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    /**
     * Main method. This will be executed when running th project.
     *
     * @param args
     *            execution arguments
     */
    public static void main(final String[] args) {
        log.info("Executed correctly");
    }

    /**
     * Default constructor.
     */
    private Main() {
        super();
    }

}
