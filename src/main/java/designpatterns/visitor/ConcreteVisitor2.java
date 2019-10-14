package designpatterns.visitor;

/**
 * 具体访问者 艺术公司
 * @author liujin
 * @datetime 2019/10/12 14:42
 */
public class ConcreteVisitor2 implements AbstractVisitor{
    public void action(ConcreteElement1 element) {
        System.out.println("----艺术公司开始加工铜啦---");
        element.operation();
    }

    public void action(ConcreteElement2 element) {
        System.out.println("----艺术公司开始加工纸啦---");
        element.operation();
    }
}
