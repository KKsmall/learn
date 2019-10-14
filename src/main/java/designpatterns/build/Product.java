package designpatterns.build;

import java.io.Serializable;

/**建造者模式，将对象的建造和表示分离
 * @author liujin
 * @datetime 2019/10/12 15:54
 */
public class Product implements Serializable {

    public String getA() {
        return a;
    }

    private String a;

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    private String b;
    private String c;

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }
}
