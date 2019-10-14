package designpatterns.mediation;


/**
 * 中介者模式，中介者处理客户的请求，客户只要给中介者发出请求就行
 * 抽象中介者
 * @author liujin
 * @datetime 2019/10/14 14:16
 */
public abstract class AbstractMeditor {

    abstract void register(AbstractClient client);

    /**
     * 转发客户请求
     * @param client
     */
    abstract void replay(AbstractClient client);


}
