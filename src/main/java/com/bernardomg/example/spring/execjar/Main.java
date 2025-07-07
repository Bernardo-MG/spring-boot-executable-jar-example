/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2020-2025 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
