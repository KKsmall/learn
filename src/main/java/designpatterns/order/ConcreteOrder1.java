package designpatterns.order;

/**
 * @author liujin
 * @datetime 2019/10/12 16:32
 */
public class ConcreteOrder1 implements AbstractOrder {
    private Receiver receiver;

    public void add(Receiver receiver) {
        this.receiver = receiver;
    }

    public void request() {
        System.out.println("执行命令1");
        receiver.action();
    }
}
