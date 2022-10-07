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

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public Account login() {
        boolean check = true;
        Account account = null;
        while (check) {
            System.out.println(" nhập Username");
            String username = scanner.nextLine();
            System.out.println(" nhập Password");
            String password = scanner.nextLine();
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i).getUsername().equals(username) && accounts.get(i).getPassword().equals(password)) {
                    account = accounts.get(i);
                    check =false;
                }
            }
            if (account == null){
                    System.out.println(" bạn đã đăng nhập sai đăng nhập lại ");
            }
        }
        return account;
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
        accounts.add(new Account(username, password, "User"));
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
