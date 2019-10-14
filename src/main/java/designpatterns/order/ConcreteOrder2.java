package designpatterns.order;

import javax.swing.border.AbstractBorder;

/**
 * @author liujin
 * @datetime 2019/10/12 16:33
 */
public class ConcreteOrder2 implements AbstractOrder {
    private Receiver receiver;

    public void add(Receiver receiver) {
        this.receiver = receiver;
    }

    public void request() {
        System.out.println("执行命令2");
        receiver.action();
    }
}
