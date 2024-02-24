package Multithreading;

class Mythread444 extends Thread{

    public Mythread444(String sleepingThread1) {
        super(sleepingThread1);
    }

    public void run(){
        try {
            Thread.sleep(1000);
            for(int i= 0;  i<6; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

 class InterruptedExample {

    public static void main(String[] args){
        Mythread444  st1 =  new Mythread444("SleepingThread1");
        st1.start();
    }
}

