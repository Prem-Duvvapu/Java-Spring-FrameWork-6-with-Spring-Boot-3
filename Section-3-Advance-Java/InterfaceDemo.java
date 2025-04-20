/*
 * class to class => extends
 * interface to class => implements
 * interface to interface => extends
 */

interface  A {
    //by default the variables in interfaces are static and final
    String name="Prem";
    int age=23;

    //by default the methods in interfaces are public and abstract
    void show();
    void config();
}

//multiple interfaces
interface X {
    void run();
}

interface Y extends X {

}

class B implements A,Y {
    public void show() {
        System.out.println("in B show");
    }

    public void config() {
        System.out.println("in B config");
    }
    
    public void run() {
        System.out.println("in B run");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        A obj=new B();

        obj.show();
        obj.config();

        System.out.println(A.name);
        System.out.println(A.age);

        X obj2=new B();
        obj2.run();
    }
}