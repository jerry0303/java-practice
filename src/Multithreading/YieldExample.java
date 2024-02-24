package Multithreading;

class YieldExample extends Thread{


    public YieldExample(String t1) {
        super(t1);
    }
    public void run() {


        for(int i= 0;  i<6; i++) {
            Thread.yield();//Thread goes to ready/runnable state
            System.out.println(Thread.currentThread().getName());
        }

    }

    public static void main(String args[]) throws InterruptedException {
       YieldExample t1 = new YieldExample("T1!");
        YieldExample t2 = new YieldExample("T2@@");
        YieldExample t3 = new YieldExample("T3***");
        YieldExample t4 = new YieldExample("T4");

        t1.setPriority(4);
        t2.setPriority(2);
        t3.setPriority(4);
        try{
            t1.start();
            t2.start();
            t3.start();
        }
        catch(Exception e){
            e.getMessage();
        }



    }
}
