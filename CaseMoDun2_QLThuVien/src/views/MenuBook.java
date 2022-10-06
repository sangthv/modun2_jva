package views;

import controller.ManagerBook;
import models.Book;

import java.util.Scanner;

public class MenuBook {

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        ManagerBook managerBook = new ManagerBook();
        int choice;
        do {
            System.out.println("--------------------------------------------------");
            System.out.println(" Quản Lí Thư Viện Sách: ");
            System.out.println(" 1. Nhập thông tin quấn sách");
            System.out.println(" 2. Hiền thị thông tin sách");
            System.out.println(" 3. Sắp xếp theo tên tác giả");
            System.out.println(" 4. Tìm kiếm tên sách");
            System.out.println(" 5. sửa thông tin sách theo giá");
            System.out.println(" 6. xóa thông tin sách");
            System.out.println(" 0. thoát ");
            System.out.println("------------------------------------------------------");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
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
                case 4:
                    Book book1 = managerBook.findBook();
                    System.out.println(book1);
                    break;
                case 5:
                    managerBook.editPrice();
                    break;
                case 6:
                    managerBook.delete();
                    break;
                default:
                    System.out.println("cảm ơn bạn đã đến thư viện sách");
            }
        } while (choice != 0);
    }
}
