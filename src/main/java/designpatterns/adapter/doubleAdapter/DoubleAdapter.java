package designpatterns.adapter.doubleAdapter;

import designpatterns.adapter.Traget;

/**
 * 双向适配器
 * @author liujin
 * @datetime 2019/10/14 9:08
 */
public class DoubleAdapter {

    private Traget traget;
    private AbstractAdaptee adaptee;

    public DoubleAdapter(Traget traget) {
        this.traget= traget;
    }

    public DoubleAdapter(AbstractAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void doTarget() {
        traget.say();
    }

    public void doAdaptee() {

        adaptee.hello();
    }
}
