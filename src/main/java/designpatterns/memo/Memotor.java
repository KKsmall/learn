package designpatterns.memo;

/**
 * 备忘录，保存需要的数据
 * @author liujin
 * @datetime 2019/10/12 8:34
 */
public class Memotor {

    private String state;

    public Memotor(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
