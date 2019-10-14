package designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 用来管理
 * @author liujin
 * @datetime 2019/10/12 14:52
 */
public class Manager {

    private List<AbstractElement> list = new ArrayList<AbstractElement>();

    /**
     * 接收访问者返回他元素的结果
     * @param visitor
     */
    public void accept(AbstractVisitor visitor) {
        for (AbstractElement element : list) {
            element.accept(visitor);
        }
    }

    public void add(AbstractElement element) {
        list.add(element);
    }
}
