//package QuanLiHocVien;
//
//import java.io.*;
//import java.util.ArrayList;
//
//public class IO_HocVien {
//    static File file = new File("HocVien.txt");
////
////    //    ghi file............../
//    public static void write (ArrayList < HocVien > hocViens){
//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//            for (HocVien h : hocViens) {
//                bufferedWriter.write(h.getName() + "," + h.getAge() +  "," + h.getGender() + "," +h.getPhone() + "," + h.getBirthday() + ","+ h.getLop().getId()+ "," + h.getLop().getName());
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//            fileWriter.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
////    doc file................................
//    public static ArrayList <HocVien> read () {
//        ArrayList<HocVien> hocViens = new ArrayList<>();
//
//        String name = null;
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String str = bufferedReader.readLine();
//            int age = 0;
//            String gender = null;
//            String birthday = null;
//            String phone = null;
//            while (str != null) {
//                String[] arr = str.split(",");
//                name = arr[0];
//                age = Integer.parseInt(arr[1]);
//                gender = arr[2];
//                Date date =null;
//                try {
//                    birthday = arr[3];
//                    date = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//                phone = arr[4];
//                int id = Integer.parseInt(arr[5]);
//                String name_lop= arr[6];
//                Lop lop = new Lop(id, name_lop);
//                HocVien hocVien = new HocVien(name, age, gender, phone, date, lop);
//                }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        ArrayList<HocVien> HocVien = new ArrayList<>();
//        return HocVien;
//    }