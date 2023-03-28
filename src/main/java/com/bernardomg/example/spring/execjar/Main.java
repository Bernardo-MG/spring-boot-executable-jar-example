
package com.bernardomg.example.spring.execjar;

import lombok.extern.slf4j.Slf4j;

/**
 * Main entry. This is what makes the project executable.
 * <p>
 * All it does is printing to the log.
 *
 * @author Bernardo Mart&iacute;nez Garrido
 *
 */
@Slf4j
public class Main {

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
