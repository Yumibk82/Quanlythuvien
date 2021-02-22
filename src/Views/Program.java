package Views;

import Behaviors.BookManagement;
import Behaviors.CardManagement;
import Behaviors.StudentManagement;
import Entities.Book;
import Entities.Card;
import Entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static BookManagement bookManagement = new BookManagement();
    static StudentManagement studentManagement = new StudentManagement();
    static CardManagement cardManagement = new CardManagement();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choiceMain = 0;
        startMenu:
        do {
            System.out.println("=========================");
            System.out.println("1. STUDENT MANAGEMENT");
            System.out.println("2. BOOK MANAGEMENT");
            System.out.println("3. CARD MANAGEMENT");
            System.out.println("=========================");
            System.out.println("Enter your choice please");
            try {
                choiceMain = Integer.parseInt(input.nextLine());
                if (choiceMain == 1) {
                    int choiceStudent = 0;
                    do {
                        System.out.println("=======STUDENT MANAGEMENT=======");
                        System.out.println("1. Add Student");
                        System.out.println("2. Update Student's name by ID ");
                        System.out.println("3. Update Student's all info");
                        System.out.println("4. Delete Student");
                        System.out.println("5. Show Students information");
                        System.out.println("6. Back main menu");
                        System.out.println("================================");
                        try {
                            choiceStudent = Integer.parseInt(input.nextLine());
                            switch (choiceStudent) {
                                case 1:
                                    Student studentAdd = Menu.getStudentInfo();
                                    studentManagement.addStudent(studentAdd);
                                    break;
                                case 2:
                                    System.out.println("Enter Student's id to update");
                                    int idStudentUpdate = Integer.parseInt(input.nextLine());
                                    System.out.println("Enter Student's name to update");
                                    String nameStudent = input.nextLine();
                                    studentManagement.updateNameStudent(idStudentUpdate, nameStudent);
                                    break;
                                case 3:
                                    Student studentUpdateAll = Menu.getStudentInfo();
                                    studentManagement.updateStudent(studentUpdateAll);
                                    break;
                                case 4:
                                    System.out.println("Enter Student's id to delete");
                                    int idStudentRemove = Integer.parseInt(input.nextLine());
                                    studentManagement.removeStudent(idStudentRemove);
                                    break;
                                case 5:
                                    studentManagement.showStudentInfo();
                                    break;
                                case 6:
                                    continue startMenu;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Enter a number from 1 to 6");
                        }
                    } while (choiceStudent != 7);

                } else if (choiceMain == 2) {
                    int choiceBook = 0;
                    do {
                        System.out.println("=============BOOK MANAGEMENT==============" +
                                           "\n1. Add Book" +
                                           "\n2. UpdateAll Book" +
                                           "\n3. Update name Book by id" +
                                           "\n4. Delete Book"+
                                           "\n5. Show all Book"+
                                           "\n6. Back main menu"+
                                           "\n========================================");
                        choiceBook = Integer.parseInt(input.nextLine());
                        switch (choiceBook){
                            case 1:
                                Book bookAdd = Menu.getBookInfo();
                                bookManagement.addBook(bookAdd);
                                break;
                            case 2:
                                Book bookUpdateAll = Menu.getBookInfo();
                                bookManagement.updateBookAllInfo(bookUpdateAll);
                                break;
                            case 3:
                                System.out.println("Enter a id book to update");
                                int idBookUpdate = Integer.parseInt(input.nextLine());
                                System.out.println("Enter new name book");
                                String newNameBook = input.nextLine();
                                bookManagement.updateNameBookById(idBookUpdate,newNameBook);
                                break;
                            case 4:
                                System.out.println("Enter id of book to delete");
                                int idBookDelete = Integer.parseInt(input.nextLine());
                                bookManagement.removeBook(idBookDelete);
                                break;
                            case 5:
                                bookManagement.showBookInfo();
                                break;
                            case 6:
                                continue startMenu;
                        }

                    } while (true);
                }else if(choiceMain ==3){
                    int choiceCard = 0;
                    do{
                        System.out.println("===CARD MANAGEMENT===");
                        System.out.println("1. Show all cards");
                        System.out.println("2. Add a new card");
                        System.out.println("3. Back main menu");
                        System.out.println("=====================");
                        choiceCard = Integer.parseInt(input.nextLine());
                        switch (choiceCard){
                            case 1:
                                cardManagement.showCardInfo();
                                break;
                            case 2:
                                ArrayList<Book> books = new ArrayList<>();
                                Card card = new Card();
                                System.out.println("Enter Student's id");
                                int idStudent = Integer.parseInt(input.nextLine());
                                Student student = studentManagement.getStudentByID(idStudent);
                                System.out.println("Enter Card id");
                                int idCard = Integer.parseInt(input.nextLine());
                                card.setStudent(student);
                                card.setIdCard(idCard);
                                cardManagement.addCard(card);
                                System.out.println("Enter quantity of book to borrow");
                                int quantity = Integer.parseInt(input.nextLine());
                                for (int i = 0; i < quantity; i++) {
                                    System.out.println("Enter book's id");
                                    int idBook = Integer.parseInt(input.nextLine());
                                    Book book = bookManagement.getBookById(idBook);
                                    books.add(book);
                                }
                                card.setBooks(books);
                                cardManagement.addCard(card);
                                break;
                            case 3:
                                continue startMenu;
                        }
                    }while (true);
                }
            }
            catch (NumberFormatException e){
                System.out.println("Enter a number from 1 to 3");
            }
        } while (choiceMain != 4);
    }
}
