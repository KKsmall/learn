package designpatterns.strategy;

/**
 * @author liujin
 * @datetime 2019/10/12 13:56
 */
public class main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy1());
        context.request();
        Context context2 = new Context(new ConcreteStrategy2());
        context2.request();
    }
}
