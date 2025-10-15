package UNIT2;
import  java.util.*;
public class SyncExample {
    public static void main(String[] args) throws InterruptedException {
        counter counter = new counter();
        Thread t1=new Thread(()->{
            for(int i=0;i<10;i++){
                counter.increment();
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<10;i++){
                counter.increment();
            }
        });
        t1.start();
        t1.join();
        t2.start();
//
        System.out.println("final count is :"+counter.getCount());
    }
}