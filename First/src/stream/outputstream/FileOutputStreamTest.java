package stream.outputstream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) throws FileNotFoundException {

        byte[] bs = new byte[26];
        byte data = 65;
        for (int i = 0; i < bs.length; i++) {
            bs[i] = data++;
        }

        FileOutputStream fos = new FileOutputStream("output.txt", true); // append default는 false -> 덮어쓰기
        try (fos) {
            fos.write(bs);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
