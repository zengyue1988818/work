package soft1841.day19;

/**
 * RunnableTest多线程
 */
public class RunnableTest extends  Object implements  Runnable{
    private int count = 10;
    //重写run方法
    @Override
    public void run(){
        while (true){
            //打印count变量
            System.out.print(count + " ");
            if (--count == 0 ){
                break;
            }
        }
    }

    public static void main(String[] args) {
        //创建线程对象
        RunnableTest test = new RunnableTest();
        //启动线程
        test.run();
    }
}
