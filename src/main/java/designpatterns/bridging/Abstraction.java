package designpatterns.bridging;

/**
 * 桥接模式，将实现和抽象分离，这样一个抽象可以接收不同的实现
 * @author liujin
 * @datetime 2019/10/12 16:54
 */
public abstract class Abstraction {

    protected Implation implation;

    public void add(Implation implation) {
        this.implation = implation;
    }

    public abstract void go();
}
