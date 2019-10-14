package designpatterns.factory;

/**
 * @author liujin
 * @datetime 2019/10/12 14:07
 */
public class main {
    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        factory1.request1(new ConcreteProduct1());
        factory1.request2(new ConcreteProduct());
        ConcreteFactory2 factory2 = new ConcreteFactory2();
        factory2.request1(new ConcreteProduct1());
        factory2.request2(new ConcreteProduct());
    }
}
