package designpatterns.proxy.dynamic;

import designpatterns.proxy.ConcreteSubject;
import designpatterns.proxy.Subject;

import java.lang.reflect.InvocationHandler;

/**
 * @author liujin
 * @datetime 2019/10/12 14:20
 */
public class main {
    public static void main(String[] args) {
        InvocationHandler handler = new Proxy(new ConcreteSubject());
        Subject proxy = (Subject)java.lang.reflect.Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, handler);
        proxy.say();
    }
}
