package designpatterns.visitor;

/**
 * 具体元素 纸
 * @author liujin
 * @datetime 2019/10/12 14:40
 */
public class ConcreteElement2 implements AbstractElement{
    public void accept(AbstractVisitor visitor) {
        visitor.action(this);
    }

    public void operation() {
        System.out.println("--------我是纸被加工啦-----");
    }
}
