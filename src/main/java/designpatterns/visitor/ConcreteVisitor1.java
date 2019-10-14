package designpatterns.visitor;

/**
 * 具体访问者 造币公司
 * @author liujin
 * @datetime 2019/10/12 14:42
 */
public class ConcreteVisitor1 implements AbstractVisitor {
    public void action(ConcreteElement1 element) {
        System.out.println("----造币公司开始加工铜啦---");
        element.operation();
    }

    public void action(ConcreteElement2 element) {
        System.out.println("----造币公司开始加工纸啦---");
        element.operation();
    }
}
