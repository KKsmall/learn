package designpatterns.observer;

/**
 * @author liujin
 * @datetime 2019/10/12 15:21
 */
public class ConcreteTarget extends AbstractTarget {


    @Override
    public void change(String state) {
        for (AbstractObserver observer : list) {
            observer.see(state);
        }
    }
}
