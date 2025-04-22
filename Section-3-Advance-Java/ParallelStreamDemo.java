
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        int size=10_000;
        List<Integer> nums=new ArrayList<>(size);
        Random rand=new Random();

        for (int i=1;i<=size;i++)
            nums.add(rand.nextInt(100));

        // int sum1=nums.stream()
        //             .map(val -> val*2)
        //             .reduce(0, (c,e) -> c+e);

        long seqStart=System.currentTimeMillis();
        int seqSum=nums.stream()
                    .map(val -> val*2)
                    .mapToInt(val -> val) //Converts Stream to IntStream
                    .sum();
        long seqEnd=System.currentTimeMillis();

        long parallelStart=System.currentTimeMillis();
        int parallelSum=nums.parallelStream()
                    .map(val -> val*2)
                    .mapToInt(val -> val)
                    .sum();
        long parallelEnd=System.currentTimeMillis();

        System.out.println("seq sum="+seqSum+" Seq time: "+(seqEnd-seqStart));
        System.out.println("parallel sum="+parallelSum+" Parallel time: "+(parallelEnd-parallelStart));

        //using Threads
        long seqStart2=System.currentTimeMillis();
        int seqSum2=nums.stream()
                    .map(val -> {
                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return val*2;
                    })
                    .mapToInt(val -> val) //Converts Stream to IntStream
                    .sum();
        long seqEnd2=System.currentTimeMillis();

        long parallelStart2=System.currentTimeMillis();
        int parallelSum2=nums.parallelStream()
                    .map(val -> {
                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return val*2;
                    })
                    .mapToInt(val -> val)
                    .sum();
        long parallelEnd2=System.currentTimeMillis();

        System.out.println("\n--------------Using Threads----------------");
        System.out.println("seq sum="+seqSum2+" Seq time: "+(seqEnd2-seqStart2));
        System.out.println("parallel sum="+parallelSum2+" Parallel time: "+(parallelEnd2-parallelStart2));
    }
}