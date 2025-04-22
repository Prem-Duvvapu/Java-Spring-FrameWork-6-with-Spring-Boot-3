/*
In Java, threads can exist in several states during their lifecycle. Here are the different thread states with explanations and examples:

1. **New State**:  
    A thread is in the new state when it is created but not yet started.  
    Example:
    ```java
    Thread t = new Thread(() -> System.out.println("Thread is running"));
    // Thread is in NEW state
    ```

2. **Runnable State**:  
    A thread is in the runnable state after the `start()` method is called. It is ready to run but waiting for CPU time.  
    Example:
    ```java
    t.start(); // Thread is now in RUNNABLE state
    ```

3. **Running State**:  
    A thread is in the running state when the CPU starts executing its `run()` method.  
    Example:
    ```java
    public void run() {
        System.out.println("Thread is running");
    }
    ```

4. **Waiting/Blocked State**:  
    A thread enters the waiting or blocked state when it is waiting for a resource or signal.  
    Example:
    ```java
    synchronized (lock) {
        lock.wait(); // Thread is in WAITING state
    }
    ```

5. **Terminated (Dead) State**:  
    A thread enters the terminated state after completing its execution or being stopped.  
    Example:
    ```java
    System.out.println("Thread execution completed");
    // Thread is in TERMINATED state
    ```

*/