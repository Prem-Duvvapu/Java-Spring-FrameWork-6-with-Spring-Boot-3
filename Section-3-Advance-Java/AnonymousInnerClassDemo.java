class A {
    public void show() {
        System.out.println("in A show");
    }

    public void config() {
        System.out.println("in A config");
    }
}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        A obj=new A() {
            public void show() {
                System.out.println("in new show");
            }
        };

        obj.show();
        obj.config();
    }
}