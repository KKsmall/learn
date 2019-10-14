package designpatterns.chain;

/**
 * 具体责任链对象
 * @author liujin
 * @datetime 2019/10/14 13:52
 */
public class ConcreteHandler1 extends Handler{
    @Override
    void doChain(String s) {
        if (s.equals("one")) {
            System.out.println("---被责任链对象1--处理了");
        } else {
            System.out.println("---对象1处理不了--");

            //获取责任链的下一环
            if (getHandler() != null) {
                getHandler().doChain(s);
            } else {
                System.out.println("----没有人能处理----");
            }
        }
    }
}
