import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Luffy","Zoro","Sanji");
        List<String> names2=Arrays.asList("Nami","Ussop","Chopper");
        
        // String name1=names.stream()
        //             .filter(s -> s.contains("y"))
        //             .findFirst()
        //             .orElse("Not found in names");

        // String name2=names2.stream()
        //             .filter(s -> s.contains("b"))
        //             .findFirst()
        //             .orElse("Not found in names2");

        // System.out.println(name1);
        // System.out.println(name2);

        Optional<String> name1=names.stream()
                    .filter(s -> s.contains("y"))
                    .findFirst();

        Optional<String> name2=names2.stream()
                    .filter(s -> s.contains("b"))
                    .findFirst();

        System.out.println(name1.orElse("Not found in names1"));
        System.out.println(name2.orElse("Not found in names2"));
    }
}