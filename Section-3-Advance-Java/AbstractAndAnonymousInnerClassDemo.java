abstract class A {
    public abstract void show();
}

public class AbstractAndAnonymousInnerClassDemo {
    public static void main(String[] args) {
        A obj=new A() {
            public void show() {
                System.out.println("in A show");
            }
        };
        
        obj.show();
    }
}