package src.IO;

import java.io.IOException;
import java.io.InputStream;

public class InputExam {

    public static void StreamTest(InputStream is) {
        try {
            while (true) {
                int i = is.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StreamTest(System.in);
    }
}
