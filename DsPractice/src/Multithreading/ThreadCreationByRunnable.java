package Multithreading;

public class ThreadCreationByRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String args[]){
        ThreadCreationByRunnable r1 = new ThreadCreationByRunnable();
        Thread t1 = new Thread(r1);

        //r1.start();
        r1.run();
        //t1.start();

        System.out.println(Thread.currentThread().getName());

    }
}
