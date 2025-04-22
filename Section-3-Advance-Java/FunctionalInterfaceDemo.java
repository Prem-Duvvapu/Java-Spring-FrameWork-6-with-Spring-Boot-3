//Functional interface/Single Abstract Method(SAM) interface
//Functional interface contains only one method

@FunctionalInterface
interface A {
    void show();
}

// class B implements A {
//     public void show() {
//         System.out.println("In B show");
//     }
// }


public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // A obj=new B();
        // obj.show();

        A obj=new A() {
            public void show() {
                System.out.println("in anonymous A show");
            }
        };

        obj.show();
    }
}