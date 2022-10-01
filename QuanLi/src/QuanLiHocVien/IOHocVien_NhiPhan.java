package QuanLiHocVien;

import java.io.*;
import java.util.ArrayList;

public class IOHocVien_NhiPhan {
    static File file = new File("HocVien.txt");

    public static void write (ArrayList<HocVien> hocViens){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hocViens);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static  ArrayList<HocVien> read (){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList < HocVien > hocViens = (ArrayList<HocVien>) objectInputStream.readObject();
            return hocViens;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}


