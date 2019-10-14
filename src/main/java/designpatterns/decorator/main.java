package designpatterns.decorator;

/**
 * @author liujin
 * @datetime 2019/10/14 15:16
 */
public class main {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(component);
        decorator.request();
    }
}
