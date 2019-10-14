package designpatterns.mediation;

/**
 * 具体客户
 * @author liujin
 * @datetime 2019/10/14 14:25
 */
public class ConcreteClient2 extends AbstractClient{

    /**
     * 这里是用来处理客户经过中介收到的请求，比如客户1给中介发送消息，中介转发给此对象
     */
    @Override
    void receiver() {
        System.out.println("-------具体客户2收到来自其他客户的请求---");
    }

    @Override
    void send() {
        System.out.println("---具体客户2发出请求---");
        meditor.replay(this);
    }
}
