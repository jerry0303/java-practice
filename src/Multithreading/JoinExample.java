package Multithreading;

class MyThread extends Thread {
    static Thread mt;

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("In Runnning Threadx");

            try{Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
    class JoinExample{
    public static void main(String[] args) throws InterruptedException {
       // MyThread mt = (MyThread) Thread.currentThread();
        MyThread t = new MyThread();

        t.start();
        t.join();
        for(int i=0; i<2; i++){
            System.out.println("In  Main Thread");
        }


    }
}
