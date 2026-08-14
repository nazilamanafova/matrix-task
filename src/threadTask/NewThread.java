package threadTask;

public class NewThread implements Runnable{

    public void run(){
        for (int i = 0; i< 10000; i++){
            System.out.println(i);

            try{
                Thread.sleep(20000);
            } catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }
    }
}
