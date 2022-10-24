package mywriter;

import java.io.Writer;

public class MyWriter extends Writer {

    private static String output;
    private final StringBuilder builder;

    public MyWriter() {
        output = "";
        this.builder = new StringBuilder();
    }

    @Override
    public void write(char[] cbuf, int off, int len) {
        output = builder.insert(output.length(), cbuf, off, len).toString();
    }

    @Override
    public void flush() {

    }

    @Override
    public void close() {

    }

    public static String getOutput() {
        return output;
    }
}
