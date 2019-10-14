package designpatterns.bridging;

/**
 * @author liujin
 * @datetime 2019/10/12 16:59
 */
public class main {
    public static void main(String[] args) {
        Abstraction abstraction = new ConcreteAbs1();
        abstraction.add(new ConcreteImpl());
        abstraction.go();
    }
}
