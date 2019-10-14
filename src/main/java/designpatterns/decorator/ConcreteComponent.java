package designpatterns.decorator;

/**
 * 具体组件
 * @author liujin
 * @datetime 2019/10/14 15:07
 */
public class ConcreteComponent implements Component{

    public void action(String s) {
        System.out.println("-----我是被装饰了----");
    }
}
