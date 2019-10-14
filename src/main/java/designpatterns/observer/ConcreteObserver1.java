package designpatterns.observer;

/**
 * @author liujin
 * @datetime 2019/10/12 15:21
 */
public class ConcreteObserver1 implements AbstractObserver {
    public void see(String st) {
        System.out.println("--------观察者1收到通知啦------");
    }
}
