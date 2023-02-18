package CollectionsExamples;

import java.util.*;

class Student
{
    int Roll_no;
    String className;
    String name;
    public Student(int Roll_no, String className , String name)
    {
        this.className =className;
        this.Roll_no = Roll_no;
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "Roll_no=" + Roll_no +
                ", className='" + className + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
        Student s1 = new Student(5, "java","Narinder");
        Student s2 = new Student(6,"c++","Bhuvan");
        Student s3 = new Student(7,"php","Jatin");
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

//        Comparator<Student> comparator = new Comparator<>() {
//            @Override
//            public int compare(Student i, Student j) {
////                if(i.Roll_no > j.Roll_no)
////                    return 1;
////                else
////                    return -1;
//                return i.Roll_no>j.Roll_no?1:-1;
//
//            }
//        };

        Comparator<Student> comparator = (Student o1, Student o2) -> o1.Roll_no > o2.Roll_no?1:-1;


        Collections.sort(list,comparator);
        System.out.println(list.toString());
        list.stream().sorted(comparator).forEach(n-> System.out.println(n));
        list.stream().filter(n->n.Roll_no%2==0).forEach(n-> System.out.println(n));
        list.stream().forEach(n-> System.out.println(n.className));
//        list.stream().map(n->n.name.contains("j")).forEach(n-> System.out.println(n));

    }
}
