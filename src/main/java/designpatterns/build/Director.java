package designpatterns.build;

/**指挥者
 * @author liujin
 * @datetime 2019/10/12 16:01
 */
public class Director {

    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void concrete() {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.getResult();
    }
}
