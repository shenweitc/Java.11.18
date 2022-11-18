package MySet_18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo01 {
    public static void main(String[] args) {
        //创建set对象
        Set<String> s=new HashSet<>();
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        //无序
        //System.out.println(s);

        //迭代器打印
//        Iterator<String> it=s.iterator();
//        while(it.hasNext()){
//            String next = it.next();
//            System.out.println(next);
//        }

        //增强for
//        for (String s1 : s) {
//            System.out.println(s1);
//        }

        //Lambda
//        s.forEach(str-> System.out.println(str));
    }
}
