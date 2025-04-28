import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(3,9,8,6,5);
        // nums.forEach(val -> System.out.println(val));

        //Stream can be used only once
        Stream<Integer> s1=nums.stream();

        //filter
        Stream<Integer> s2=s1.filter(val -> val%2==0); //[6,8]

        //map
        Stream<Integer> s3=s2.map(val -> val*2);//[12,16]

        //reduce
        int sum=s3.reduce(0,(c,e) -> c+e);//24

        System.out.println(sum);

        //filter uses the Predicate interface
        Predicate<Integer> p=new Predicate<Integer>() {
            @Override
            public boolean test(Integer val) {
                return (val%2==0);
            }
        };

        //map uses the Function Interface
        Function<Integer,Integer> func=new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer val) {
                return val*2;
            }  
        };

        //This will also work
        // int res=nums.stream()
        //         .filter(p)
        //         .map(func)
        //         .reduce(0,(c,e) -> c+e);

        int res=nums.stream()
                .filter(val -> val%2==0)
                .map(val -> val*2)
                .reduce(0,(c,e) -> c+e);
        System.out.println(res);

        Stream<Integer> sortedStream=nums.stream()
                                        .sorted();

        sortedStream.forEach(val -> System.out.println(val));
    }
}