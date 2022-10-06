package views;

import controller.ManagerBook;
import models.Book;

import java.util.Scanner;

public class MenuUser {
    public void menuUser(){
        Scanner scanner = new Scanner(System.in);
        ManagerBook managerBook = new ManagerBook();

        while (true){
            int choice = -1;
            System.out.println("--------------------------------------------------");
            System.out.println(" sách trong thư viện: ");
            System.out.println(" 1. thông tin sách");
            System.out.println(" 2. Tìm kiếm tên sách");
            System.out.println(" 0. thoát ");
            System.out.println("------------------------------------------------------");
            while (choice == -1) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println(" bạn chọn sai định dạng, phải chọn số! ");
                }
            }
            switch (choice) {
                case 1:
                  managerBook.show();
                    break;
                case 2:
                    Book book1 = managerBook.findBook();
                    System.out.println(book1);
                    break;
                case 0:
                    System.out.println("cảm ơn bạn đã đến thư viện sách");
                    return;
            }
        }
    }
}