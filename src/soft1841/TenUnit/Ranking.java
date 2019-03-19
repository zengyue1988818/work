package soft1841.TenUnit;
/**
 * 亚足联的排名获取
 * @zengyue
 * 19.03.19
 */

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Ranking {
    public static void main(String[] args) {
        //将亚足联排名前十的男足国家储存在数组中
        String[] teams = {
                "伊朗","韩国","日本","澳大利亚","沙特阿拉伯","印度","卡塔尔","中国","叙利亚","乌兹别克斯塔"
        };
        //创建键,值类分别为Integer ，String 的map集合对象
        Map<Integer,String> map = new HashMap<Integer, String>();
        //循环遍历数组Teams中的元素
        for (int i  =0; i<teams.length; i++){
            //向map集合中添加元素
            map.put(i+ 1,teams[i]);
        }
        //创建控制台输入对象
        Scanner sc = new Scanner(System.in);
        //提示信息
        System.out.print("依次输入的名次查询亚足联排名前十的某一只男足国家队:");
        //可能产生的异常的代码块
        try {
            //控制台依次输入名次
            int number = sc.nextInt();
            //输入的名次在0-10之间
            if (number > 0 && number<=10){
                //控制台输出与名次相匹配的国家
                System.out.println("亚足联排名第" +number + "的男足国家队是" +map.get(number) + "  ");
                //关闭控制台输入
                sc.close();
            }else {
                //提示信息
                System.out.println("输入错误！ 只能输入1-10中的某一个整数。");
            }
            //捕捉输入类型不匹配异常
        }catch (InputMismatchException e){
            System.out.println("输入错误！ 只能输入1-10中的某一个整数。");
        }
    }
}
