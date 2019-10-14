package designpatterns.order;

/**
 * @author liujin
 * @datetime 2019/10/12 16:31
 */
public class ConcreteReceiver2 implements Receiver {
    public void action() {
        System.out.println("----接收者2收到命令---");
    }
}
