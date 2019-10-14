package designpatterns.observer;

/**
 * @author liujin
 * @datetime 2019/10/12 15:24
 */
public class main {

    public static void main(String[] args) {
        AbstractTarget target = new ConcreteTarget();
        target.add(new ConcreteObserver1());
        target.add(new ConcreteObserver2());

        target.change("");
    }
}
