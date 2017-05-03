/*
 * The MIT License
 *
 * Copyright 2017 Ariel.Lenis.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.dotnetscript.managers;

import java.io.PrintStream;

/**
 *
 * @author Ariel.Lenis
 */
public abstract class ManagerBase {
    protected PrintStream logger;
    
    /**
     * The manager base constructor
     * @param logger 
     */
    public ManagerBase(PrintStream logger) {
        this.logger = logger;
    }
   
    /**
     * The log method
     * @param message 
     */
    protected void log(String message) {
        this.logger.println(message);
    }
    
    /**
     * the log method with format
     * @param message 
     */
    protected void prettyLog(String message) {
        this.log("[DotNetScript] " + message);
    }
}
