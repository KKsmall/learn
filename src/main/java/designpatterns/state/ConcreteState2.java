package designpatterns.state;

/**
 * 具体状态2
 * @author liujin
 * @datetime 2019/10/14 15:37
 */
public class ConcreteState2 implements AbstractState{

    public void say(Context context) {
        System.out.println("----我是状态2的行为----");
        context.setState(new ConcreteState1());
    }
}
