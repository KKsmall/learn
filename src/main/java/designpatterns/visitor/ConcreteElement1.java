package designpatterns.visitor;

/**
 * 具体元素 铜
 * @author liujin
 * @datetime 2019/10/12 14:40
 */
public class ConcreteElement1 implements AbstractElement{
    public void accept(AbstractVisitor visitor) {
        visitor.action(this);
    }

    public void operation() {
        System.out.println("--------我是同被加工啦-----");
    }
}
