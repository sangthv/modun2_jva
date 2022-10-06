package TaoThuMucVaFile;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class TaoFile {
    public static void main(String[] args) {
        File file1 = new File("hello.txt");

        System.out.println("kiem tra " + file1.exists());
        try {
            file1.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
