package Behaviors;

import Entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    ArrayList<Student>  students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }
    public void updateNameStudent(int idStudent,String name){
        for (Student eStudent:students) {
            if(eStudent.getIdStudent() == idStudent){
                eStudent.setName(name);
            }
        }
    }
    public void updateStudent(Student student){
        for (Student eStudent: students) {
            if(eStudent.getIdStudent() == student.getIdStudent()){
                eStudent.setName(student.getName());
                eStudent.setCodeStudent(student.getCodeStudent());
                eStudent.setBirthday(student.getBirthday());
            }
        }
    }
    public Student getStudentByID(int idStudent){
        Student student = new Student();
        for (Student eStudent: students) {
            if(eStudent.getIdStudent() == idStudent){
                student = eStudent;
            }
        }
        return student;
    }
    public void showStudentInfo(){
        for (Student eStudent: students) {
            System.out.println(eStudent.toString());
        }
    }
    public void removeStudent(int idStudent){
        students.removeIf(student->student.getIdStudent()==idStudent);
    }
}
