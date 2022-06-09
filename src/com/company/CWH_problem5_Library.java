package com.company;


class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added");
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exist");


    }
    void returnBook(String book){
        addBook(book);


    }
    void showAvailableBooks(){
        System.out.println("Available Books are: ");
        for (String book:this.books) {
            if(book==null){
                continue;
            }
            System.out.println("*: "+book);
        }

    }
}

public class CWH_problem5_Library {
    public static void main(String[] args) {
        Library l1  = new Library();

        l1.addBook("Wings Of Fire");
        l1.addBook("C++");
        l1.addBook("Python");
        l1.addBook("Java");
        l1.showAvailableBooks();

        l1.issueBook("Python");
        l1.showAvailableBooks();

        l1.returnBook("Python");
        l1.showAvailableBooks();

    }
}
