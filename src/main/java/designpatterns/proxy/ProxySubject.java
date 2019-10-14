package designpatterns.proxy;

/**
 * 代理对象
 * @author liujin
 * @datetime 2019/10/12 14:10
 */
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    public void say() {
        System.out.println("----代理前置行为----");
        subject.say();
        System.out.println("----代理后置行为----");
    }
}
