package designpatterns.state;

/**
 * 环境类，接受状态，状态改变则调用不同的状态对象
 * @author liujin
 * @datetime 2019/10/14 15:42
 */
public class Context {

    private AbstractState state;

    public Context() {
        //初始化状态对象
        this.state = new ConcreteState1();
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void handler() {
        state.say(this);
    }
}
