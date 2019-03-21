package soft1841.TenUnit;
/**
 * list集合中的常用方法，移除，随机
 * @zengyue
 * 19.03.21
 */

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        //获得0-3之间的随机数
        int i=(int)(Math.random()) * list.size();
        System.out.println("随机获取集合中的元素：" + list.get(i));
        //将指定索引位置的元素从集合中移除
        list.remove(2);
        System.out.println("将索引是2的元素从集合中移除后，集合中的元素是：");
        //for循环遍历集合
        for (int j = 0; j<list.size();j++){
            System.out.println(list.get(j));
        }
    }
}
