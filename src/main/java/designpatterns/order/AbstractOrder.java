package designpatterns.order;

/**
 * 抽象命令
 * @author liujin
 * @datetime 2019/10/12 16:29
 */
public interface AbstractOrder {

    public void add(Receiver receiver);

    public void request();

}
