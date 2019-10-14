package designpatterns.memo;

/**
 * 管理者，用来调用备忘录获取原始数据
 * @author liujin
 * @datetime 2019/10/12 8:36
 */
public class Manager {

    private Memotor memotor;

    public Manager() {

    }

    public void setMemotor(Memotor memotor){
        this.memotor = memotor;
    }

    public Memotor getMemotor() {
        return memotor;
    }

    public String getState() {
        return memotor.getState();
    }

}
