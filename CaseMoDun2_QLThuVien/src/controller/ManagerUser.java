package controller;

import IO.ReadAndWrite;
import models.Book;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerUser {
    Scanner scanner = new Scanner(System.in);
    File file = new File("E:\\modun2_java\\modun2\\CaseMoDun2_QLThuVien\\src\\FileText\\Book.txt");

    ReadAndWrite<Book> readAndWrite = new ReadAndWrite<>();

    ManagerBook managerBook = new ManagerBook();

    ArrayList<Book> listBook = readAndWrite.read(file);

    ArrayList<Book> oder = new ArrayList<>();

    public void buyBook() {
        System.out.println("sách bạn muốn mua: ");
        int i = 0;
        Book book = managerBook.findBook();
        oder.add(book);
        String str = "";
        for (Book x:oder) {
            str += x + "\n";
        } {

        }
        System.out.println("bạn đã order sách: \n" + str);
    }

    public double totalMoney(){
        double total = 0.0;
        for (int i = 0; i <oder.size() ; i++) {
            total += oder.get(i).getPrice();
        }
        System.out.println("tổng giá tiền là: "+ total);
        return total;
    }
}
