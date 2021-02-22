package Views;

import Entities.Book;
import Entities.Student;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static Student getStudentInfo(){
        Student student = new Student();
        System.out.println("Enter Student's name");
            String nameStudent = input.nextLine();
            student.setName(nameStudent);
        System.out.println("Enter Student's id");
            int idStudent = Integer.parseInt(input.nextLine());
            student.setIdStudent(idStudent);
        System.out.println("Enter Student's code");
            int codeStudent = Integer.parseInt(input.nextLine());
            student.setCodeStudent(codeStudent);
        System.out.println("Enter Student's birthday");
            String birthday = input.nextLine();
            student.setBirthday(birthday);
        return student;
    }
    public static Book getBookInfo(){
        Book book = new Book();
        System.out.println("Enter Book's name");
            String nameBook = input.nextLine();
            book.setName(nameBook);
        System.out.println("Enter Book's id");
            int idBook = Integer.parseInt(input.nextLine());
            book.setIdBook(idBook);
        System.out.println("Enter Book's code");
            int codeBook = Integer.parseInt(input.nextLine());
            book.setCodeBook(codeBook);
        return book;
    }
}
