package designpatterns.factory;

/**
 * 抽象工厂，用于生产一条产品线上的对象，比如洗衣服和空调
 * @author liujin
 * @datetime 2019/10/12 13:58
 */
public interface AbstractFactory {
    /**
     * 两个方法用于生产一条线上不同产品
     */
    void request1(AbstractProduct product);
    void request2(AbstractProduct product);
}
