package com.itmill.toolkit.tests.util;

import java.io.PrintWriter;
import java.io.Writer;

/**
 * Use for collecting HTTP response.
 * 
 */
public class LogPrintWriter extends PrintWriter {

    private final StringBuffer result = new StringBuffer(256);

    public LogPrintWriter(Writer out) {
        super(out);
    }

    public void print(String s) {
        result.append(s);
        super.print(s);
    }

    public void write(String s) {
        result.append(s);
        super.write(s);
    }

    public String getResult() {
        return result.toString();
    }

}