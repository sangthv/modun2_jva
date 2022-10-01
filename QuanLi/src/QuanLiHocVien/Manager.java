package QuanLiHocVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Manager {
    ArrayList<HocVien> hocViens = IOHocVien_NhiPhan.read();
    ArrayList<Lop> lop = IOLop_NhiPhan.read();

    Scanner scanner = new Scanner(System.in);

    public Manager() {
        lop.add(new Lop(1, "CO6"));
        lop.add(new Lop(2, "CO7"));
        lop.add(new Lop(3, "CO8"));
    }

    public void inPut() {
        System.out.println(" nhap thong tin hoc vien ");
        System.out.println(" nhap ten hoc vien");
        String name = scanner.nextLine();
        int age = 0;
        while (true) {
            System.out.println(" tuoi hoc vien");
            try {
                age = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(" tuoi phai lon hon 0");
            }
        }
        System.out.println("gioi tinh ");
        String gender = scanner.nextLine();
        System.out.println(" so dien thoai");
        String phone = scanner.nextLine();
        Date date = null;
        while (true) {
            System.out.println(" nhap ngay sinh nhat theo dinh dang dd/MM/yyyy");
            String birthday = scanner.nextLine();
            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
                break;
            } catch (ParseException e) {
                System.out.println(" nhap sai dinh dang ngay thang nam");
            }
        }
        for (int i = 0; i < lop.size(); i++) {
            System.out.println(i + 1 + "," + lop.get(i).getName());
        }
        int chon = 0;

        while (true) {
            System.out.println(" moi ban chon theo thu tu ");
            try {
                chon = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(" moi ban chon lai");
            }
        }
        Lop lop1 = lop.get(chon - 1);
        HocVien hocVien1 = new HocVien(name, age, gender, phone, date, lop1);
        hocViens.add(hocVien1);
        IOHocVien_NhiPhan.write(hocViens);
    }
    //hien thi hoc vien thi
    public void show() {
        for (HocVien x : hocViens) {
            System.out.println(x.toString());
        }
    }
//    hien thi danh sach hoc vien theo lop

    public void showLop() {
        int idLop = 0;
        while (true) {
            System.out.println(" nhap id lop");
            try {
                idLop = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println(" nhap lai id");
            }
        }
        for (HocVien hv: hocViens ) {
            if ( idLop == hv.getLop().getId()){
                System.out.println(hv);
                break;
            }
        }
    }
    public void menu(){
        int chon = 0;
        do {
            System.out.println(" ----------------------------");
            System.out.println("" +
                    "1. them.\n" +
                    "2. hien thi toan bo hoc vien.\n" +
                    "3. hien thi hoc vien theo lop.\n" +
                    "0. thoat");
            System.out.println("-----------------------------");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    inPut();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    show();
                    break;
                case 0:
                    System.out.println("Cam On");
                    break;
                default:
                    System.out.println("sai r nhap lai di");
                    break;
            }

        } while (chon != 0);

    }
}

