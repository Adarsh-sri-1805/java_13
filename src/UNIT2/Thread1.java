package UNIT2;

public class Thread1 extends Thread{
    public void run() {
        try{
//        for(int i = 1; i < 11; i++){
//            System.out.println("Thread 1 " + i);
//            Thread.sleep(2000);
//        }
            for(int i = 1; i < 100; i++){
                if(i % 2 != 0)
                    System.out.println(i);
                Thread.sleep(1000);
                }
    }
        catch(InterruptedException e){
        System.out.println(e.getMessage());
        }
    }
}
