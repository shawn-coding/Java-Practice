package Basics.Threads;

public class newThread extends Thread{
    public void run(){
        for(int i=1;i<21;i++){
            System.out.println(this.getName() + " is running "+i+" time(s).");
        
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
