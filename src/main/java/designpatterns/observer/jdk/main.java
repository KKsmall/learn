package designpatterns.observer.jdk;

import java.util.Observable;

/**
 * @author liujin
 * @datetime 2019/10/12 15:44
 */
public class main {
    public static void main(String[] args) {
        Observable observable = new ConcreteTarget();
        observable.addObserver(new ConcreteObserver1());
        observable.addObserver(new ConcreteObserver2());
        ((ConcreteTarget) observable).set("哈哈");
    }
}
