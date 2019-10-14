package designpatterns.proxy.dynamic;

import designpatterns.proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author liujin
 * @datetime 2019/10/12 14:19
 */
public class Proxy implements InvocationHandler {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----代理前置行为---");
        method.invoke(subject, args);
        System.out.println("----代理后置行为---");
        return null;
    }
}
