package decorator.IO;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LoweraseInputStream(
                new BufferedInputStream(
                    new FileInputStream("src/decorator/IO/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}
