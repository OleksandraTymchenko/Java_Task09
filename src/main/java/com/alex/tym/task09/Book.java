package com.alex.tym.task09;

import java.util.Objects;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private int price;

    public Book(int id, String name, String author, String publisher, int year, int pages, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void view() {
        System.out.println("id = "+ id + ", name: " + name
                + ", author: " + author + ", publisher: " + publisher
                + ", year = " + year + ", pages = " + pages + ", price = " + price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                year == book.year &&
                pages == book.pages &&
                price == book.price &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, publisher, year, pages, price);
    }

    @Override
    public String toString() {
        return "id = " + id + " name: " + name
                + ", author: " + author + ", publisher: " + publisher
                + ", year = " + year + ", pages = " + pages + ", price = " + price ;
    }
}