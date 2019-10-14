package designpatterns.memo;

/**
 * 备忘录模式，发起者，需要被备忘属性的对象
 * @author liujin
 * @datetime 2019/10/12 8:32
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memotor createMemotor() {
        return new Memotor(state);
    }

    /**
     * 恢复原始数据，这里传进来的对象是管理者保存的对象
     * @param memotor
     * @return
     */
    public String reset(Memotor memotor) {
        return this.state = memotor.getState();
    }
}
