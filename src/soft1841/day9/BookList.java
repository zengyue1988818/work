package soft1841.day9;
/**
 * list接口练习
 * @zengyue
 * 19.03.19
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1, "白夜行", "32.9"));
        list.add(new Book(2, "活着", "24.5"));
        list.add(new Book(6, "教父", "45.7"));
        //[A,B,C,D]
        System.out.println(list);
        //[A,B,高，C,D]
        list.add(2, new Book(3, "思想道德修养和法律基础", "24.78"));
        System.out.println(list);
        //[A,B,C,D]
        list.remove(2);
        System.out.println(list);
        list.set(2, new Book(4, "新职业英语", "34.5"));
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(new Book(2, "活着", "43.5"));
        System.out.println(list);
        //从头到尾找到第一个“B”
        System.out.println(list.indexOf(new Book(2, "活着", "24.5")));
        //从未到头找到第一个"B"
        System.out.println(list.lastIndexOf(new Book(2, "活着", "24.5")));





        System.out.println("通过For循环遍历集合：");
        //用for循环遍历集合
        for (int i = 0, len = list.size(); i < len;i++){
            System.out.println(list.get(i));
            System.out.println("用Iterator迭代器遍历集合：");
            //用iterator迭代器遍历集合
            Iterator<Book> iterator = list.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next() + "  ");
            }
            System.out.println("用lambda循环遍历集合：");
            //通过Lambda表达式遍历集合
            list.forEach(Book-> System.out.println(Book));
        }
    }
}
