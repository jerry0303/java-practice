package Multithreading;


class ThreadEx extends Thread{

    public ThreadEx() {
        super();
    }

    public  void run(){
        for(int i=0; i<2;  i++){
            System.out.println(Thread.currentThread().getName()+" Priority is= "+Thread.currentThread().getPriority());
        }
    }
}
public class ThreadPriorities {
    public static void main(String args[]){
        ThreadEx t1 = new ThreadEx();
        //xt1.setPriority();
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
