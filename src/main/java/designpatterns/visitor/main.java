package designpatterns.visitor;

/**
 * @author liujin
 * @datetime 2019/10/12 15:00
 */
public class main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.add(new ConcreteElement1());
        manager.add(new ConcreteElement2());

        manager.accept(new ConcreteVisitor1());
        System.out.println("------------------");
        manager.accept(new ConcreteVisitor2());
    }
}
