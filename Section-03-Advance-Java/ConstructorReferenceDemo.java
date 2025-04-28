//A constructor reference is a special kind of method reference that refers to a class constructor instead of a regular method
//ClassName::new

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Luffy","Zoro","Sanji");

        List<Student> students=new ArrayList<>();

        // for (String name: names)
        //     students.add(new Student(name));

        // students=names.stream()
        //             .map(name -> new Student(name))
        //             .toList();

        // 

        //Construtor reference
        students=names.stream()
                    .map(Student::new)
                    .toList();

        System.out.println(students);
    }
}