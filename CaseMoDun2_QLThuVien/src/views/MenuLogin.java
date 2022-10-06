package views;

import controller.ManagerAccount;
import models.Account;

import java.util.Scanner;

public class MenuLogin {
    Scanner scanner = new Scanner(System.in);
    MenuBook menuProduct = new MenuBook();
    ManagerAccount managerAccount = new ManagerAccount();

    MenuUser menuUser = new MenuUser();

    public void menu() {
        int choice = 0;
        while (true) {
            System.out.println("menu--------------------");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký");
            System.out.println("0. Thoát");
            System.out.println("-------------------------");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println(" bạn chọn sai định dạng, phải chọn số! ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            switch (choice) {
                case 1:
                    Account account = managerAccount.login();
                    if (account.getRole().equals("admin")){
                        menuProduct.menu();
                    }else {
                        menuUser.menuUser();
                    }

//                    if (account.getUsername().equals("sang2") && account.getPassword().equals("123")){
//                        menuProduct.menu();
//                    }else {
//                        System.out.println("user");
//                    }
                    break;
                case 2:
                    managerAccount.register();
                    break;
                case 0:
                    System.out.println(" bạn đã thoát tài khoản");
                    return;
            }
        }
    }
}
