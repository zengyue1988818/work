package soft1841.week1;


import java.util.*;
public class StudentMap {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list1.add(new Student("180231","陈伟霆"));
        list1.add(new Student("180232","吴亦凡"));
        list1.add(new Student("180233","权志龙"));
        list2.add(new Student("180234","杨幂"));
        list2.add(new Student("180235","古力娜扎"));
        Map<String,List<Student>> map = new HashMap<>();
        map.put("男生",list1);
        map.put("女生",list2);
        //用迭代器输出集合
        Iterator<Map.Entry<String,List<Student>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,List<Student>> entry = iterator.next();
            System.out.println(entry.getKey());
            Iterator<Student> listIterator = entry.getValue().iterator();
            while (listIterator.hasNext()){
                System.out.println(listIterator.next());
            }
        }
    }
}