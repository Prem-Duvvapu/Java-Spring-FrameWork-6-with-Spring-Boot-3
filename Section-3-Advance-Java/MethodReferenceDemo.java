//A method reference is shorthand syntax for a lambda expression that calls an existing method
//ClassName::methodName
//instance::methodName

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Luffy","Zoro","Sanji");

        List<String> upperNames=names.stream()
                                .map(name -> name.toUpperCase())
                                .toList();
        System.out.println(upperNames);

        //Method Reference
        List<String> upperNames2=names.stream()
                                    .map(String::toUpperCase)
                                    .toList();
        upperNames2.forEach(System.out::println);
    }
}