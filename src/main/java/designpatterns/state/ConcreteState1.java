package designpatterns.state;

/**
 * 具体状态1
 * @author liujin
 * @datetime 2019/10/14 15:37
 */
public class ConcreteState1 implements AbstractState{

    public void say(Context context) {
        System.out.println("----我是状态1的行为----");
        //这里可以做逻辑判断，状态不符合的话传入其他状态
        context.setState(new ConcreteState2());
    }
}
