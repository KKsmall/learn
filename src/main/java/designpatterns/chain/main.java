package designpatterns.chain;

/**
 * @author liujin
 * @datetime 2019/10/14 13:58
 */
public class main {

    public static void main(String[] args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();

        handler1.setHandler(handler2);
        handler1.doChain("two");
    }
}
