package designpatterns.observer.jdk;

import designpatterns.observer.AbstractObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liujin
 * @datetime 2019/10/12 15:21
 */
public class ConcreteObserver1 implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println("-----观察者1收到通知啦");
    }
}
