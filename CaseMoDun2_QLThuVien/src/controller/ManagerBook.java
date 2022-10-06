package controller;

import IO.ReadAndWrite;
import models.Book;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerBook {
File file = new File("E:\\modun2_java\\modun2\\CaseMoDun2_QLThuVien\\src\\FileText\\Book.txt");
ReadAndWrite <Book> readAndWrite = new ReadAndWrite<>();
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
    }while (price == 0);

    return new Book(bookName, authorName, publishDate, manufactureName, price);
}
    public void addBook(Book book){
        books.add(book);
        readAndWrite.write(file,books);
    }

public void show(){
    for (int i = 0; i<books.size(); i++ ){
        System.out.println(books.get(i).toString());
    }
}
public void sortByAuthorName(){
    Collections.sort(books, new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthorName().compareToIgnoreCase(o2.getAuthorName());
        }
    });
}
    public void delete(){
     books.clear();
        readAndWrite.write(file,books);
    }
}
