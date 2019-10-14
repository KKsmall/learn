package designpatterns.proxy;

/**
 * 具体对象，被代理类
 * @author liujin
 * @datetime 2019/10/12 14:11
 */
public class ConcreteSubject implements Subject {
    public void say() {
        System.out.println("--------我是个笨蛋-------");
    }
}
