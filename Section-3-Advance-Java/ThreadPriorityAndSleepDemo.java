class A extends Thread {
    public void run() {
        for (int i=0;i<100;i++) {
            System.out.println("Prem");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Interruption occured..."+e);
            }           
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i=0;i<100;i++) {
            System.out.println("Sai");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Interruption occured..."+e);
            }
        }
    }
}

public class ThreadPriorityAndSleepDemo {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();

        //prority can be set for thread
        //1 is min priority
        //10 is max priority
        // obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();


    }
}