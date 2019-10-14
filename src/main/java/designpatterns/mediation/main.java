package designpatterns.mediation;

/**
 * @author liujin
 * @datetime 2019/10/14 14:34
 */
public class main {

    public static void main(String[] args) {
        ConcreteMeditor meditor = new ConcreteMeditor();
        ConcreteClient c1 = new ConcreteClient();
        ConcreteClient2 c2 = new ConcreteClient2();
        meditor.register(c1);
        meditor.register(c2);

        //给中介者发送客户请求
        c1.send();
    }
}
