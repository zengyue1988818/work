package soft1841.day35;

/**
 * 单例模式
 */
public class Singleton {
    //创建 singleton 的一个对象
    private static  Singleton instance = new Singleton();
    //让构造方法为 private ,这样该类就不会被实例化
    private Singleton(){

    }
    //静态方法获取唯一可用对象
    public  static Singleton getInstance(){
        return instance;
    }
    //成员方法，显示消息
    public void showMessage(){
        System.out.println("hello,world!");
    }
}
