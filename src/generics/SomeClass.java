package generics;

import java.io.IOException;
import java.io.RandomAccessFile;

public class SomeClass {
    public static void main(String[] args) {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("file.txt", "rw");
            //randomAccessFile.write("text text".getBytes());
            System.out.println(randomAccessFile.readLine());
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
