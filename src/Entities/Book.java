package Entities;

public class Book {
    private String name;
    private int idBook;
    private int codeBook;

    public Book(){}
    public Book(String name, int idBook, int codeBook) {
        this.name = name;
        this.idBook = idBook;
        this.codeBook = codeBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(int codeBook) {
        this.codeBook = codeBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", idBook=" + idBook +
                ", codeBook=" + codeBook +
                '}';
    }
}
