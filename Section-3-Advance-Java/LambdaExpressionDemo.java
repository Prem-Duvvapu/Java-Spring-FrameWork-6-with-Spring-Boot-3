//We can use lambda expression for only functional interfaces
@FunctionalInterface
interface A {
    void show(int i);
}

@FunctionalInterface
interface B {
    int add(int i,int j);
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        // A obj=new A() {
        //     public void show(int i) {
        //         System.out.println("in show "+i);
        //     }
        // };
        A obj=(i) -> System.out.println("in show "+i); //lambda expression with parameters
        obj.show(3);

        // B obj1=new B() {
        //     public int add(int i,int j) {
        //         return i+j;
        //     }
        // };
        // int sum=obj1.add(3,5);
        // System.out.println(sum);
        B obj1=(i,j) -> i+j; //lambda expression with return type
        int sum=obj1.add(3,5);
        System.out.println(sum);
    }
}