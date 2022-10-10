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
                    check = false;
                }
            }
            if (account == null) {
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

    //        xóa tài khoản user
    public void deleteUser() {
        int choice = 0;
        System.out.println(" tài khoản người dùng sẽ xóa? ");
        String userName = scanner.nextLine();
        if (userName.equals("sang2")) {
            System.out.println("không thể xóa tài khoản này !");
            return;
        }
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUsername().equals(userName)) {
                ++choice;
                System.out.println("bạn có muốn xóa tài khoản người dùng này không nhấn Y/N? ");
                String x = scanner.nextLine();
                if (x.equalsIgnoreCase("y")) {
                    accounts.remove(i);
                    System.out.println(" bạn đã xóa tài khoản nguời dùng");
                }else {
                    System.out.println(" bạn hủy xóa");
                }
            }
        }
        if (choice == 0) {
            System.out.println("Không tồn tại tài khoản này");
        }
        readAndWrite.write(file, accounts);
    }

    //    //        hiển thị người truy cập
    public void showUser() {
        System.out.println("danh sách người truy cập vào: ");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i).getUsername() + " " + accounts.get(i).getRole());
        }
    }
}
