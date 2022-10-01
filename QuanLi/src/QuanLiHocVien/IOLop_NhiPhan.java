package QuanLiHocVien;

import java.io.*;
import java.util.ArrayList;

public class IOLop_NhiPhan {
    static File file = new File("Lop.txt");

    public static void write (ArrayList<Lop> lop){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(lop);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static  ArrayList<Lop> read (){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList <Lop> lop = (ArrayList<Lop>) objectInputStream.readObject();
            return lop;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}