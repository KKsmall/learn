package designpatterns.decorator;

/**
 * 具体装饰者
 * @author liujin
 * @datetime 2019/10/14 15:10
 */
public class ConcreteDecorator extends Decorator{


    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void pre() {
        System.out.println("----扩展的前置行为----");
    }

    @Override
    void request() {
        pre();
        component.action("哈哈");
    }
}
