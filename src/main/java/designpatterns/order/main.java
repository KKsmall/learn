package designpatterns.order;

/**
 * @author liujin
 * @datetime 2019/10/12 16:38
 */
public class main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        AbstractOrder order = new ConcreteOrder2();
        Receiver receiver = new ConcreteReceiver2();
        order.add(receiver);
        invoker.add(order);
        invoker.invoke();
    }
}
