import java.sql.SQLOutput;

public class mainm {
    public static void main(String[] args) {
        student st = new student(13,"Adarsh", "F");
        st.setGrade("Pass");
        System.out.println(st.getGrade());
    }

}

