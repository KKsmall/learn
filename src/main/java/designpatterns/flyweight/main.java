package designpatterns.flyweight;

/**
 * @author liujin
 * @datetime 2019/10/14 11:32
 */
public class main {
    public static void main(String[] args) {
        ShareFactory factory = new ShareFactory();
        Share share1 = factory.getShare("a");
        Share share2 = factory.getShare("b");
        Share share3 = factory.getShare("c");

        share1.share(new UnShare());
        share2.share(new UnShare());
        share3.share(new UnShare());

    }
}
