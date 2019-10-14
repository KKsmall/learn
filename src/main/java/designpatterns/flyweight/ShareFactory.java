package designpatterns.flyweight;

import java.util.HashMap;

/**
 * 享元工厂 保存享元对象
 * @author liujin
 * @datetime 2019/10/14 11:22
 */
public class ShareFactory {

    private HashMap<String, Share> map = new HashMap<String, Share>();

    public Share getShare(String key) {
        Share concreteShare = map.get(key);

        if (null != concreteShare) {
            System.out.println("-------------享元对象已存在，获取成功----");
        } else {
            System.out.println("-------享元对象不存在，创建-----");
            concreteShare = new ConcreteShare(key);
            map.put(key, concreteShare);
        }
        return concreteShare;
    }
}
