package mywriter;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class WriterMainApp {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("First sentence");
        strings.add("Second sentence");
        strings.add("Third sentence");
        strings.add("Fourth sentence");
        strings.add("Fifth sentence");

        WriterMainApp writerApp = new WriterMainApp();
        writerApp.writeString(strings);

        String output = MyWriter.getOutput();
        System.out.println(output);
    }

    private void writeString(List<String> strings) {
        Writer writer = new MyWriter();
        for (String string : strings) {
            try {
                writer.write(string);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
