//To make the code loosely coupled we use interfaces
//Using interfaces we will generalize things

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code () {
        System.out.println("Coding in laptop...");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Coding in desktop...");
    }
}

class Developer {
    public void developApp(Computer com) {
        com.code();
    }
}

public class NeedOfInterfaceDemo {
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer desk=new Desktop();

        Developer dev=new Developer();
        dev.developApp(lap);
    }
}