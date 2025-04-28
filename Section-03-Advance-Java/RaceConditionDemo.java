class Counter {
    public int cnt;

    // public void incrementCnt() {
    //     cnt++;
    // }

    //synchronized will make sure that only one thread can access this at any point of time
    public synchronized  void incrementCnt() {
        cnt++;
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();

        Runnable obj1 = () -> {
            for (int i=0;i<1000;i++)
                c.incrementCnt();
        };

        Runnable obj2 = () -> {
            for (int i=0;i<1000;i++)
                c.incrementCnt();
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

        //main thread will not continue until t1 and t2 threads are finished
        t1.join();
        t2.join();

        //If we don't call join() for threads the main thread may print c.cnt value in the middle while the
        //other two threads are running
        System.out.println(c.cnt);
    }
}