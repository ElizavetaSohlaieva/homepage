package homwork6;

import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private String author;
    private String edition;
    private int year;
    private int pages;
    private double price;

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

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void viewBooks(){
        System.out.println(id + name + author + edition + year + pages + price);
    }

    Book[] books = new Book[10];

    //public Book(String books) {
      //  this.books = books;
    //}
    static Book[] addBook(Book[] books){
        Book[] res = new Book[books.length];
        int counter = 0;
        for (Book elem: books) {
            res[counter++] = elem;
        }
        return Arrays.copyOf(res, counter);
    }
}
