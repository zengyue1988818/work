package soft1841.week1;

import java.util.ArrayList;
import java.util.List;


public class StudenTest {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list1.add(new Student("180231","陈伟霆"));
        list1.add(new Student("180232","吴亦凡"));
        list1.add(new Student("180233","权志龙"));
        list2.add(new Student("180234","杨幂"));
        list2.add(new Student("180235","古力娜扎"));
       System.out.println("按性别输出的循环");
     System.out.println("男生：");
        for (int i = 0;i< list1.size(); i++){
            System.out.println(list1.get(i).getId() + "  "
                         + list1.get(i).getName() + "  "
                   );
        }
        System.out.println("女生：");
        for (int j = 0; j<list2.size();j++){
            System.out.println(list2.get(j).getId() + "  "
            +list2.get(j).getName() +"  ");
        }

    }
}

