package designpatterns.factory;

/**
 * @author liujin
 * @datetime 2019/10/12 14:05
 */
public class ConcreteProduct implements AbstractProduct {
    public void say() {
        System.out.println("-------我是空调--------");
    }
}
