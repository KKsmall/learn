package designpatterns.flyweight;

/**
 * 享元模式，把共享的部分抽取出来给大家调用，不同的部分独立传入进行处理
 * 共享部分的接口,接受非享元部分做处理
 * @author liujin
 * @datetime 2019/10/14 11:13
 */
public interface Share {

    void share(UnShare unShare);
}
