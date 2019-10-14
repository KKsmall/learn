package designpatterns.flyweight;

/**
 * 具体享元对象
 * @author liujin
 * @datetime 2019/10/14 11:18
 */
public class ConcreteShare implements Share{

    private String key;

    public ConcreteShare(String key) {
        this.key = key;
    }

    public void share(UnShare unShare) {
        System.out.println("-------具体享元被调用-----:" + key);
        unShare.unShare();
    }
}
