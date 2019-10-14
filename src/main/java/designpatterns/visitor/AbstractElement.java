package designpatterns.visitor;

/**
 * 访问者模式，将各元素的操作分离出来成独立的类，
 * 如有铜元素和纸元素，造币公司对两种元素的操作是生成硬币和纸币，
 * 艺术公司对两元素的操作生成的是雕塑和画。
 * 即不同访问者访问相同的元素，生成不一样的结果
 * @author liujin
 * @datetime 2019/10/12 14:29
 */
public interface AbstractElement {

    void accept(AbstractVisitor visitor);
}
