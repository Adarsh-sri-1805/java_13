package UNIT2;

import java.sql.SQLOutput;

public class Mymain {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        System.out.println(th1.getPriority());
        System.out.println(th1.getName());
        th1.setName("My Thread 1");
        System.out.println(th1.getName());
        th1.setPriority(10);
        th2.start();
        th1.start();
    }
}
