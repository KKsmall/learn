package designpatterns.build;

/**
 * @author liujin
 * @datetime 2019/10/12 15:58
 */
public class Builder1 extends AbstractBuilder {
    @Override
    void buildA() {
        product.setA("建造者1构建属性A:");
    }

    @Override
    void buildB() {
        product.setB("建造者1构建属性B:");
    }

    @Override
    void buildC() {
        product.setC("建造者1构建属性C:");
    }
}
