package designpatterns.build;

/**
 * @author liujin
 * @datetime 2019/10/12 16:03
 */
public class main {

    public static void main(String[] args) {
        Director director = new Director(new Builder2());
        director.concrete();

    }
}
