import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(3,5,6,8,9);
        // nums.forEach(val -> System.out.println(val));

        //Stream can be used only once
        Stream<Integer> s1=nums.stream();
        Stream<Integer> s2=s1.filter(val -> val%2==0);
        s2.forEach(val -> System.out.println(val));
    }
}