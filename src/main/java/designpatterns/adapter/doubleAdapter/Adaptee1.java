package designpatterns.adapter.doubleAdapter;

/**
 * @author liujin
 * @datetime 2019/10/14 9:05
 */
public class Adaptee1 implements AbstractAdaptee {
    public void hello() {
        System.out.println("-----我是适配者被适配啦----");
    }
}
