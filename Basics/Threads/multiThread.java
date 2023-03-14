package Basics.Threads;

public class multiThread {
    public static void main(String[] args){
        newThread t1 = new newThread();
        t1.setName("Thread 1");
        newThread t2 = new newThread();
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}
