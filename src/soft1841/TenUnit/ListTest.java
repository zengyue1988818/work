package soft1841.TenUnit;
/**
 * 随机获取集合中的元素
 * @zengyue
 * 19.03.19
 */

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    //主方法
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<>();
        //向集合中添加元素
        list.add("A");
        list.add("B");
        list.add("C");
        //获得0-2之间的随机数
        int i = (int)(Math.random() * list.size());
        System.out.println("随机获取集合中的元素：" + list.get(i));
        //将指定索引位置的元素从集合中移除
        list.remove(2);
        System.out.println("将索引是“2”的元素从集合中移除后，集合中的元素是：");
        //循环遍历集合
        for (int j = 0;j <list.size(); j++){
            //获取指定索引处的值
            System.out.println(list.get(j));
        }
    }
}
