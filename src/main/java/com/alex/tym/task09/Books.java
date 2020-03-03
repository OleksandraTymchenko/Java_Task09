package com.alex.tym.task09;

import java.util.Arrays;
import java.util.Comparator;

public class Books {

    private int countBooks = 0;
    private Book[] books;

    public Books(int i) {
        books = new Book[i];
    }

    public void compareAuthorNames(Book[] books) {

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String name1 = ((Book)o1).getAuthor();
                String name2 = ((Book)o2).getAuthor();
                return name1.compareTo(name2);
            }
        });
    }

    public void comparePuplisherNames(Book[] books) {

        Arrays.sort(books, new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        String name1 = ((Book) o1).getPublisher();
                        String name2 = ((Book) o2).getPublisher();
                        return name1.compareTo(name2); }
                });
    }

    public void comparePrices(Book[] books) {

        Arrays.sort(books, new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {

            Book price1 = (Book) o1;
            Book price2 = (Book) o2;
            if (price1.getPrice() > price2.getPrice()) return -1;
            if (price1.getPrice() < price2.getPrice()) return 1;
            return 0;
        }
        });
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (countBooks == books.length) {
            return;
        }
        books[countBooks++] = book;
    }

    public void printBooks() {
        if (countBooks == 0) {
            System.out.println("No results found");
        }
        for (Book elem : books) {
            System.out.println(elem);
        }
    }

    public void changePrice(int x) {
        Book[] newPriceBooks = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            int oldPrice = books[i].getPrice();
            int newPrice = oldPrice * (100 + x) / 100;
            books[i].setPrice(newPrice);
        }
    }

    public Book[] searchBookByAuthor(String str) {
        Book[] search = new Book[books.length];
        int count = 0;
        for (Book elem : books) {
            if (elem.getAuthor().equals(str)) {
                search[count] = elem;
                count++;
            }
        }
        return Arrays.copyOf(search, count);
    }

    public Book[] searchBookByYear(int y) {
        Book[] search = new Book[books.length];
        int count = 0;
        for (Book elem : books) {
            if (elem.getYear() > y) {
                search[count] = elem;
                count++;
            }
        }
        return Arrays.copyOf(search, count);
    }
}
