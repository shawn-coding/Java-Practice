package Basics.Threads;

public class newThread extends Thread{
    public void start(){
        for(int i=1;i<21;i++){
            System.out.println("This thread is running "+i+" time(s).");
        
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
