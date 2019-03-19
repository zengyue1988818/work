package soft1841.day10;
/**
 * 实现接口的电脑类
 * @znegyue
 * 19.03.20
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComputerList {
    public static void main(String[] args) {
        //创建List对象，存入Computer对象
        List<Computer> list = new ArrayList<>();
        list.add(new Computer("华硕电脑",15));
        list.add(new Computer("联想电脑",23));
        list.add(new Computer("惠普电脑",34));
        list.add(new Computer("戴尔电脑",12));
        //调用Collection的sort方法，会自动调用之前写的compareTo方法进行排序
     Collections.sort(list);
     //foreach循环遍历
        for (Computer computer :list){
            System.out.println("名称："+ computer.getName()+  "  Id:"+computer.getId());
        }
    }
}
