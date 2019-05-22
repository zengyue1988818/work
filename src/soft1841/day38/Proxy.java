package soft1841.day38;

import java.sql.SQLOutput;

public class Proxy implements Subject {
    @Override
    public void buyMac() {
        //引用并创造真是对象案例，即“我”
        RealSubject realSubject = new RealSubject();
        //调用真是对象的方法，进行代理购买MAC
        realSubject.buyMac();
        //代理对象额外做的操作
        this.WrapMAC();
    }
    public void WrapMAC(){
        System.out.println("用盒子包装好的MAC");
    }

}
