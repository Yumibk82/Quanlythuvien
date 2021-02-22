package Entities;

import java.util.Date;
import java.util.List;

public class Card {
    private int idCard;
    private List<Book> books;
    private Student student;
    private Date dateBorrow;

    public Card(){}
    public Card(int idCard, List<Book> books, Student student, Date dateBorrow) {
        this.idCard = idCard;
        this.books = books;
        this.student = student;
        this.dateBorrow = dateBorrow;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    @Override
    public String toString() {
        return "Card{" +
                "idCard=" + idCard +
                ", books=" + books +
                ", student=" + student +
                ", dateBorrow=" + dateBorrow +
                '}';
    }
}
