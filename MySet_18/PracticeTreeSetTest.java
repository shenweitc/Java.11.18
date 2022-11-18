package MySet_18;

import java.util.TreeSet;

public class PracticeTreeSetTest {
    public static void main(String[] args) {
        Student s1=new Student("yihao",23,90,99,50);
        Student s2=new Student("erhao",24,90,98,50);
        Student s3=new Student("sanhao",25,95,100,30);
        Student s4=new Student("sihao",26,60,99,70);
        Student s5=new Student("wuhao",26,70,80,70);

        TreeSet<Student> ts=new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
