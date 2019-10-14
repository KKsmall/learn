package designpatterns.memo;

/**
 * @author liujin
 * @datetime 2019/10/12 8:42
 */
public class main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("原始状态");
        Manager manager = new Manager();
        manager.setMemotor(originator.createMemotor());
        System.out.println("--------" + originator.getState());
        originator.setState("修改状态");
        System.out.println("--------" + originator.getState());
        originator.reset(manager.getMemotor());
        System.out.println("--------" + originator.getState());
    }
}
