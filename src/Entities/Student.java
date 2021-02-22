package Entities;

public class Student {
    private String name;
    private int idStudent;
    private int codeStudent;
    private String birthday;

    public Student(){}

    public Student(String name, int idStudent, int codeStudent, String birthday) {
        this.name = name;
        this.idStudent = idStudent;
        this.codeStudent = codeStudent;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idStudent=" + idStudent +
                ", codeStudent=" + codeStudent +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
