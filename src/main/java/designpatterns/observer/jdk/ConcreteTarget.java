package designpatterns.observer.jdk;


import java.util.Observable;

/**
 * @author liujin
 * @datetime 2019/10/12 15:35
 */
public class ConcreteTarget extends Observable {

    public void set(String o) {
        super.setChanged();
        super.notifyObservers(o);
    }

}
