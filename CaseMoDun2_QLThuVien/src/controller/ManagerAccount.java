package controller;

import IO.ReadAndWrite;
import models.Account;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerAccount {
    File file = new File("E:\\modun2_java\\modun2\\CaseMoDun2_QLThuVien\\src\\FileText\\QuanLiThuVien.txt");
    ReadAndWrite<Account> readAndWrite = new ReadAndWrite<>();
    ArrayList<Account> accounts = readAndWrite.read(file);
    Scanner scanner = new Scanner(System.in);

    public Account login() {
        System.out.println(" nhập Username");
        String username = scanner.nextLine();
        System.out.println(" nhập Password");
        String password = scanner.nextLine();
//        if (username.equals("sang2") && password.equals("123")){
//            return new Account(username,password,"nn");
//        }
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUsername().equals(username) && accounts.get(i).getPassword().equals(password)) {
                return accounts.get(i);
            }

        }
        return null;
    }
    public void register() {
        String username;
        while (true) {
            System.out.println("Nhập username");
            username = scanner.nextLine();
            if (checkUserName(username)) {
                break;
            }
            System.out.println("Bạn đã nhập trùng username ");
        }
        System.out.println("Nhập password");
        String password = scanner.nextLine();
        System.out.println("Nhập role");
        String role = scanner.nextLine();
        accounts.add(new Account(username, password, role));
        readAndWrite.write(file, accounts);
    }

    public boolean checkUserName(String username) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
