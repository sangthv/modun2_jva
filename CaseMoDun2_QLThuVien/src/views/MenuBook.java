package views;

import controller.ManagerBook;
import models.Book;

import java.util.Scanner;

public class MenuBook {

public void menu (){
        Scanner scanner = new Scanner(System.in);
    ManagerBook managerBook = new ManagerBook();
        int choice ;
        do {
        System.out.println(" Quản Lí Thư Viện Sách: ");
        System.out.println(" 1. Nhập thông tin quấn sách");
        System.out.println(" 2. Hiền thị thông tin sách");
        System.out.println(" 3. Sắp xếp theo tên tác giả");
        System.out.println(" 4. sửa thông tin sách theo giá");
        System.out.println(" 5. xóa thông tin sách");
        System.out.println(" 0. thoát ");
       choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                Book book = managerBook.inPut();
                managerBook.addBook(book);
                break;
            case 2:
                managerBook.show();
                break;
            case 3:
                managerBook.sortByAuthorName();
                break;
//            case 4:
//
//                break;
            case 5:
                managerBook.delete();
                break;
            default:
                System.out.println("cảm ơn bạn đã đến thư viện sách");
        }
    }while (choice !=0);
    }
}
