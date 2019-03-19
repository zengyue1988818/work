package soft1841.TenUnit;
/**
 * iterator 获取集合中的元素
 * @zengyue
 * 19.03.19
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        //实例化集合类对象
        Collection<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        //创造迭代器
        Iterator<String> iterator = list.iterator();
        //判断是否有下一代元素
        while (iterator.hasNext()){
            //获取集合中的元素
            String string = (String) iterator.next();
            System.out.println(string);
        }
    }
}
