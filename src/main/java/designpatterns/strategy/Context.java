package designpatterns.strategy;

/**
 * 环境类，接受具体策略，及调用,多个策略可考虑放到map集合里统一管理
 * @author liujin
 * @datetime 2019/10/12 13:53
 */
public class Context implements Strategy{

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void request() {
        strategy.request();
    }
}
