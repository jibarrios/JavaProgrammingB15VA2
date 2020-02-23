package day57_exceptions2;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileNotFound {
    public static void main(String[] args) throws Exception {
//        try {
          Files.readAllLines(Paths.get("File.txt"));
//        }catch (IOException e) {
//            System.out.println("Exception happened and caught");
//        }


        System.out.println("After Try Catch");
    }
}
