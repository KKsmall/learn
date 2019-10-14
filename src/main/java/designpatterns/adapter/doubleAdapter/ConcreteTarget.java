package designpatterns.adapter.doubleAdapter;

import designpatterns.adapter.Traget;

/**
 * @author liujin
 * @datetime 2019/10/14 9:06
 */
public class ConcreteTarget implements Traget {
    public void say() {
        System.out.println("---我是目标我被适配啦--");
    }
}
