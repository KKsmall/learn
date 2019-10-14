package designpatterns.visitor;

/**
 * 抽象访问者
 * @author liujin
 * @datetime 2019/10/12 14:34
 */
public interface AbstractVisitor {

    /**
     * 不同元素有不同的行为,这里最好是具体元素，因为访问者中可以调用具体元素的其他方法
     */
    void action(ConcreteElement1 element);
    void action(ConcreteElement2 element);
}
