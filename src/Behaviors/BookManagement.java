package Behaviors;

import Entities.Book;

import java.util.ArrayList;

public class BookManagement {
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        books.add(book);
    }
    public void updateNameBookById(int idBook, String name){
        for (Book eBook: books) {
            if(eBook.getIdBook() == idBook){
                eBook.setName(name);
            }
        }
    }
    public void updateBookAllInfo(Book book){
        for (Book eBook: books) {
            if(eBook.getIdBook() == book.getIdBook()){
                eBook.setCodeBook(book.getCodeBook());
                eBook.setName(book.getName());
            }
        }
    }
    public void removeBook(int idBook){
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getIdBook() == idBook){
                books.remove(books.get(i));
            }
        }
    }
    public void showBookInfo(){
        for (Book eBook: books) {
            System.out.println(eBook.toString());
        }
    }
    public Book getBookById(int idBook){
        Book book = new Book();
        for (Book eBook: books) {
            if(eBook.getIdBook() == idBook){
                book = eBook;
            }
        }
        return book;
    }
}
