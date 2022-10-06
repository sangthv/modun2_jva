package models;

import java.io.Serializable;

public class Book implements Serializable {
    private String bookName, authorName, publishDate, manufacturename;
    private int price;

    public Book() {
    }

    public Book(String bookName, String authorName, String publishDate, String manufacturename, int price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishDate = publishDate;
        this.manufacturename = manufacturename;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getManufacturename() {
        return manufacturename;
    }

    public void setManufacturename(String manufacturename) {
        this.manufacturename = manufacturename;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sách {" +
                "tên sách ='" + bookName + '\'' +
                ", tác giả  ='" + authorName + '\'' +
                ", ngày sản xuất='" + publishDate + '\'' +
                ", nhà sản xuất='" + manufacturename + '\'' +
                ", giá bán =" + price +'}';
    }
}
