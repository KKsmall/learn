package designpatterns.observer;

/**
 * @author liujin
 * @datetime 2019/10/12 15:21
 */
public class ConcreteObserver2 implements AbstractObserver {
    public void see(String st) {
        System.out.println("--------观察者2收到通知啦------");
    }
}
