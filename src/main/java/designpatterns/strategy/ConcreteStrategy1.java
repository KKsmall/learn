package designpatterns.strategy;

/**
 * @author liujin
 * @datetime 2019/10/12 13:52
 */
public class ConcreteStrategy1 implements Strategy {

    public void request() {
        System.out.println("---------执行策略1--------");
    }
}
