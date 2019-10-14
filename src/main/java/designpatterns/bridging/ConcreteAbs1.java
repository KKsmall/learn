package designpatterns.bridging;

/**
 * 具体抽象化对象
 * @author liujin
 * @datetime 2019/10/12 16:57
 */
public class ConcreteAbs1 extends Abstraction{
    @Override
    public void go() {
        implation.action();
    }
}
