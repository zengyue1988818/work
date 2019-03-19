package soft1841.day9;
/**
 * list接口练习
 * @zengyue
 * 19.03.19
 */

import java.util.ArrayList;
import java.util.List;

public class BookList {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1,"白夜行","32.9") );
        list.add(new Book(2,"活着","24.5"));
        list.add(new Book(6,"教父","45.7"));
        System.out.println(list);
        list.add(2,new Book(3,"思想道德修养和法律基础","24.78"));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(2,new Book(4,"新职业英语","34.5"));
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(new Book(2,"活着","43.5"));
        System.out.println(list);
        System.out.println(list.indexOf(new Book(2,"活着","24.5")));
        System.out.println(list.lastIndexOf(new Book(2,"活着","24.5")));
    }
}
