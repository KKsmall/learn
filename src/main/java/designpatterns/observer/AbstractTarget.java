package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式：一个状态发生变化通知相应的观察者
 * @author liujin
 * @datetime 2019/10/12 15:10
 */
public abstract class AbstractTarget {

    protected List<AbstractObserver> list = new ArrayList<AbstractObserver>();

    public void add(AbstractObserver observer) {
        list.add(observer);
    }

    /**
     * 通知所有对象
     */
    public abstract void change(String state);

}
