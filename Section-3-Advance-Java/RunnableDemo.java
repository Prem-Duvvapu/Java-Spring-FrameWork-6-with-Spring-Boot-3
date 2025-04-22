class A implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("Luffy");
            try {
                Thread.sleep(10);
                // throw new InterruptedException();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("Zoro");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable obj1=new A();
        Runnable obj2=new B();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

        //using anonymous class
        Runnable obj3=new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Sanji");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t3=new Thread(obj3);
        t3.start();


        //using lambda expression
        Runnable obj4=() -> {
            for (int i=0;i<10;i++) {
                System.out.println("Nami");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t4=new Thread(obj4);
        t4.start();
    }
}