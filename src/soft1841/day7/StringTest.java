package soft1841.day7;
/**
 * string stringBuffer StringBuilder 的比较
 * @zengyue
 * 19.03.16
 */
public class StringTest {
    private static int t = 12345;
    public static void main(String[] args) {
        testString();
        testStringBuffer();
        testStringBuilder();
    }
    //测试String
    public static void testString() {
        String s = "";
        //获取以毫秒ms为单位的当前开始时间
        long begin = System.currentTimeMillis();
        //调用12345次String的拼接操作，每次都会生成新的String对象！
        for (int i = 0; i < t; i++) {
            s += "Java";
        }
        //获取以毫秒ms为单位的当前结束时间
        long over = System.currentTimeMillis();
        //求出实际耗时
        System.out.println("String模拟JVM优化操作的时间为：" + (over - begin) +
                "ms");
    }
    //测试StringBuffer
       public static void testStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
        //获取以毫秒为单位的当前开始时间
        long begin = System.currentTimeMillis();
        for (int i = 0; i < t; i++) {
            stringBuffer.append("Java");
        }
        //获取以毫秒为单位的当前结束时间
        long over = System.currentTimeMillis();
        //实际耗时
        System.out.println("StringBuffer模拟JVM优化操作的时间为：" + (over -
                begin) + "ms");
    }
    //测试StringBuilder
    public static void testStringBuilder() {
        //获取以毫秒ms为单位的当前开始时间
        StringBuilder stringBuilder = new StringBuilder();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < t; i++) {
            stringBuilder.append("Java");
        }
        //获取以毫秒ms为单位的当前结束时间
        long over = System.currentTimeMillis();
        //实际耗时
        System.out.println("StringBuilder模拟JVM优化操作的时间为：" + (over -
                begin) + "ms");
    }
}
