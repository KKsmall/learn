package designpatterns.proxy;

/**
 * @author liujin
 * @datetime 2019/10/12 14:15
 */
public class main {
    public static void main(String[] args) {
        ProxySubject subject = new ProxySubject(new ConcreteSubject());
        subject.say();
    }
}
