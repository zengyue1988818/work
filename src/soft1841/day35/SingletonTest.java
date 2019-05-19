package soft1841.day35;

public class SingletonTest {
    public static void main(String[] args) {
        //编译错误，因为构造方法不是可见的，只能在singleton类内部使用
       // Singleton object = new Singleton();
        //通过singleton的类方法singleton.getInstance() 获取唯一可用的对象
        Singleton object = Singleton.getInstance();
        //显示消息
        object.showMessage();
    }
}
