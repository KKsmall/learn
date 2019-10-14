package designpatterns.mediation;

/**
 * 抽象客户类
 * @author liujin
 * @datetime 2019/10/14 14:17
 */
public abstract class AbstractClient {

    protected AbstractMeditor meditor;

    public void setMeditor(AbstractMeditor meditor) {
        this.meditor = meditor;
    }

    abstract void receiver();
    abstract void send();
}
