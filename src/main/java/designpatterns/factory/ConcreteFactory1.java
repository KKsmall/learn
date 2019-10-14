package designpatterns.factory;

/**
 * @author liujin
 * @datetime 2019/10/12 14:01
 */
public class ConcreteFactory1 implements AbstractFactory {

    public void request1(AbstractProduct product) {
        System.out.println("----工厂1开始生产-----");
        product.say();
    }

    public void request2(AbstractProduct product) {
        System.out.println("----工厂1开始生产-----");
        product.say();
    }
}
