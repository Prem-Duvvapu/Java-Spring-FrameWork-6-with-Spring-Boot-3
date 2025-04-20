abstract class Car {
    public abstract void drive();

    public void playMusice() {
        System.out.println("Playing music in car");
    }
} 

class Tata extends Car {
    @Override
    public void drive() {
        System.out.println("Driving in tata");
    }
    
}

public class AbstractDemo {
    public static void main(String[] args) {
        Car obj=new Tata();
        obj.playMusice();
        obj.drive();
    }
}