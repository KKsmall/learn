package designpatterns.adapter;

/**
 * @author liujin
 * @datetime 2019/10/14 8:49
 */
public class Adapter implements Traget {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void say() {
        adaptee.hello();
    }
}
