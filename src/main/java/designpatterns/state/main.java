package designpatterns.state;

/**
 * @author liujin
 * @datetime 2019/10/14 15:54
 */
public class main {

    public static void main(String[] args) {
        Context context = new Context();
        context.handler();
        context.handler();
        context.handler();
        context.handler();
    }
}
