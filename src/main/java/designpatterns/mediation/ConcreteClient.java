package designpatterns.mediation;

/**
 * 具体客户
 * @author liujin
 * @datetime 2019/10/14 14:25
 */
public class ConcreteClient extends AbstractClient{

    @Override
    void receiver() {
        System.out.println("-------具体客户1收到请求---");
    }

    @Override
    void send() {
        System.out.println("---具体客户1发出请求---");
        //客户自己要发送数据时请求中介转发
        meditor.replay(this);
    }
}
