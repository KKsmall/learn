package designpatterns.build;

import designpatterns.proxy.dynamic.Proxy;

/**
 * 抽象构建者
 * @author liujin
 * @datetime 2019/10/12 15:57
 */
public abstract class AbstractBuilder {

    protected Product product = new Product();

    abstract void buildA();
    abstract void buildB();
    abstract void buildC();

    public void getResult() {
        System.out.println("a:" + product.getA() + "  b:" + product.getB() + " c:" + product.getC());
    }
}
