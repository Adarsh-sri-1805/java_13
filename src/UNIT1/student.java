package UNIT1;

public class student {
    public int rollno;
    public String name;
    private String grade;

    public student(int rollno, String name, String grade) {
        this.rollno = rollno;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
    //    student(int rollno, String name) {
//        this.rollno = rollno;
//        this.name = name;
//    }
//
//
//    abstract void attend_class();
//    abstract void give_exam();
//
//
//    void register() {
//        System.out.println("Name is " + name + " registered successfully with Roll no " + rollno);
//    }

}