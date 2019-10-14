package designpatterns.order;

/**
 * 调用者
 * @author liujin
 * @datetime 2019/10/12 16:30
 */
public class Invoker {

    private AbstractOrder order;

    public void add(AbstractOrder order) {
        this.order = order;
    }

    public void invoke() {
        order.request();
    }
}
