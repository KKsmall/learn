package designpatterns.adapter;

/**
 * @author liujin
 * @datetime 2019/10/14 9:00
 */
public class main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.say();
    }
}
