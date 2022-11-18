package MySet_18;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(4);
        ts.add(3);
        ts.add(2);
        ts.add(5);
        //打印
//        System.out.println(ts);

        //迭代器
//        Iterator<Integer> it = ts.iterator();
//        while ((it.hasNext())){
//            Integer next = it.next();
//            System.out.println(next);
//        }

        //增强for
//        for (Integer t : ts) {
//            System.out.println(t);
//        }

        //Lambda
//        ts.forEach(s-> System.out.println(s));

    }
}
