class A extends Thread {
    @Override
    public void run() {
        for (int i=0;i<100;i++) {
            System.out.println("Prem");
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        for (int i=0;i<100;i++) {
            System.out.println("Sai");
        }
    }
}

public class ThreadsDemo {
    public static void main(String[] args) {
        A obj=new A();
        B obj2=new B();

        obj.start();
        obj2.start();
    }
}