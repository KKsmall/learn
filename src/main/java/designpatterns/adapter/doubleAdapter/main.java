package designpatterns.adapter.doubleAdapter;

/**
 * @author liujin
 * @datetime 2019/10/14 9:12
 */
public class main {

    public static void main(String[] args) {
        DoubleAdapter adapter = new DoubleAdapter(new Adaptee1());
        System.out.println("---------正向适配----");
        adapter.doAdaptee();

        DoubleAdapter adapter1 = new DoubleAdapter(new ConcreteTarget());
        System.out.println("---------反向适配----");
        adapter1.doTarget();
    }
}
