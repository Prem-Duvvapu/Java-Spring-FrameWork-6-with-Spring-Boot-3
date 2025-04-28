
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    public String name;
    public int age;

    public Student(String name,int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    //To have own by default comparator implement Comparable interface and override compareTo() method
    @Override
    public int compareTo(Student that) {
        if (this.age>that.age)
            return 1;
        return -1;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(43);
        nums.add(56);
        nums.add(72);
        nums.add(91);

        Comparator<Integer> com1=new Comparator<Integer>() {
            @Override
            public int compare(Integer i,Integer j) {
                if (i%10>j%10)
                    return 1;
                return -1;
            }
        };

        //Comparator using lambda expression
        Comparator<Integer> com2=(i,j) -> (i%10>j%10) ? 1: -1;

        //sorts in ascending order
        Collections.sort(nums);
        System.out.println(nums);

        //sorts in ascending order based on the last digit of the number
        Collections.sort(nums,com1);
        System.out.println(nums);

        List<Student> students=new ArrayList<>();
        Student s1=new Student("Naruto",17);
        Student s2=new Student("Kakashi",25);
        Student s3=new Student("Sasuke",18);
        students.add(s1);
        students.add(s2);
        students.add(s3);

        //This will not work now because Student doesn't implement Comparable interface. So Student doesn't know how the sort the elements
        //In case of Integer class it implements Comparable class and overrided compareTo() method and defined how to sort the elements
        //Collections.sort(students);

        //Comparator for user-defined class
        Comparator<Student> com3=new Comparator<Student>() {
            //sort based on the age of student
            public int compare(Student s1,Student s2) {
                if (s1.age>s2.age)
                    return 1;
                return -1;
            }
        };

        //using lambda expression
        Comparator<Student> com4=(stud1,stud2) -> (stud1.age>stud2.age) ? 1:-1;

        // Collections.sort(students,com3);
        // for (Student s: students)
        //     System.out.println(s);

        //Here, we are using compareTo() defined in Student class
        Collections.sort(students);
        for (Student s: students)
            System.out.println(s);
    }
}