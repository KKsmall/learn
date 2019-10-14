package designpatterns.build;

/**
 * @author liujin
 * @datetime 2019/10/12 16:00
 */
public class Builder2 extends AbstractBuilder {
    @Override
    void buildA() {
        product.setA("建造者2构建属性A:");
    }

    @Override
    void buildB() {
        product.setB("建造者2构建属性B:");
    }

    @Override
    void buildC() {
        product.setC("建造者2构建属性C:");
    }
}
