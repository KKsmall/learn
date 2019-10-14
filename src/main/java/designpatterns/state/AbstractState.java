package designpatterns.state;

/**
 * 状态模式，不同状态有不同行为，将这些行为抽离出来，类似if else-if
 * 状态类接口
 * @author liujin
 * @datetime 2019/10/14 15:36
 */
public interface AbstractState {

    public void say(Context context);
}
