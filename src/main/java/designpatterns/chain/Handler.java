package designpatterns.chain;

/**
 * 责任链模式 抽象责任链对象
 * @author liujin
 * @datetime 2019/10/14 13:50
 */
public abstract class Handler {

    /**
     * 存放下一环的处理对象
     */
    private Handler handler;

    /**
     * 链式调用
     * @param s
     */
    abstract void doChain(String s);

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
