package designpatterns.order;

/**
 * 具体接收者
 * @author liujin
 * @datetime 2019/10/12 16:30
 */
public class ConcreteReceiver1 implements Receiver{
    public void action() {
        System.out.println("----接收者1收到命令---");
    }
}
