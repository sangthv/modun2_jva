package controller;

import IO.ReadAndWrite;
import models.Account;
import models.Book;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerBook {
    File file = new File("E:\\modun2_java\\modun2\\CaseMoDun2_QLThuVien\\src\\FileText\\Book.txt");

    ManagerAccount managerAccount = new ManagerAccount();
    ReadAndWrite<Book> readAndWrite = new ReadAndWrite<>();
    ArrayList<Book> books = readAndWrite.read(file);
    Scanner scanner = new Scanner(System.in);

    public Book inPut() {
        System.out.println(" nhập tên sách :");
        String bookName = scanner.nextLine();
        System.out.println(" nhập tên tác giả: ");
        String authorName = scanner.nextLine();
        System.out.println(" nhập ngày xuất bản : ");
        String publishDate = scanner.nextLine();
        System.out.println(" nhập nhà sản xuất: ");
        String manufactureName = scanner.nextLine();
        int price = 0;
        do {
            try {
                System.out.println(" nhập giá: ");
                price = Integer.parseInt(scanner.nextLine());

            } catch (Exception e) {
                System.out.println("Bạn phải nhập số!");
            }
        } while (price == 0);
        return new Book(bookName, authorName, publishDate, manufactureName, price);
    }

    public void addBook(Book book) {
        books.add(book);
        readAndWrite.write(file, books);
    }

    public void show() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString());
        }
    }

    //sắp xếp sách theo tên tác giả............................
    public void sortByAuthorName() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthorName().compareToIgnoreCase(o2.getAuthorName());
            }
        });
    }

    //tìm kiếm theo tên sách...................
    public Book findBook() {
        while (true) {
            System.out.println("Nhập tên sách: ");
            String bookName = scanner.nextLine();
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getBookName().equals(bookName)) {
                    System.out.println("Đã tìm thấy!");
                    return books.get(i);
                }
            }
            System.out.println(" sách không có ");
        }
    }

    //sửa giá.......................
    public void editPrice() {
        int price = 0;
        boolean check = true;
        while (check) {
            System.out.println("Nhập tên sách: ");
            String bookName = scanner.nextLine();
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getBookName().equals(bookName)) {
                    boolean nhap = false;
                    do {
                        try {
                            nhap = false;
                            System.out.println(" nhập giá muốn sửa lại: ");
                            price = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e) {
                            System.out.println("nhập lại giá muốn sửa ");
                            nhap = true;
                        }
                    } while (nhap);
                    books.get(i).setPrice(price);
                    readAndWrite.write(file, books);
                    check = false;
                }
            }
            if (check) {
                System.out.println("Nhập sai");
            }
        }
    }

    //xóa  danh sách.................
    public void delete() {
        while (true) {
            System.out.println(" nhập tên sách muốn xóa: ");
            String bookName = scanner.nextLine();
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getBookName().equals(bookName)) {
                    System.out.println("bạn có muốn xóa không: Yes/No? ");
                    if(scanner.nextLine().equalsIgnoreCase("y")){
                        books.remove(books.get(i));
                        readAndWrite.write(file, books);
                        System.out.println("Xóa thành công!");
                        return ;
                    }else {
                        System.out.println("bạn phải nhập y để xóa");
                        System.out.println("Hủy xóa!");
                        return;
                    }
                }
            }
            System.out.println("sách không tồn tại");
        }
    }



}
