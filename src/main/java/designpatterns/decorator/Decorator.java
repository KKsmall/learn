package designpatterns.decorator;

/**
 * 抽象装饰者，扩展对象行为
 * @author liujin
 * @datetime 2019/10/14 15:08
 */
public abstract class Decorator {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
     abstract void request();
}
