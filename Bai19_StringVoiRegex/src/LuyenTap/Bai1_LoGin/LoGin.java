package LuyenTap.Bai1_LoGin;

import java.util.Scanner;

public class LoGin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("nhâp tên truy cập");
        String userName = scanner.nextLine();
        System.out.println("nhập mật khẩu");
        String passWord = scanner.nextLine();
        if (userName.equalsIgnoreCase("hello") && passWord.length() >6){
            System.out.println("đăng nhập thành công");
        }else {
            System.out.println("sai tên truy cập và mật khẩu");
        }
        }
    }
}
