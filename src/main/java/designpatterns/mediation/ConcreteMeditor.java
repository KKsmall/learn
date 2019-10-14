package designpatterns.mediation;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 * @author liujin
 * @datetime 2019/10/14 14:20
 */
public class ConcreteMeditor extends AbstractMeditor{

    private List<AbstractClient> list  = new ArrayList<AbstractClient>();

    @Override
    void register(AbstractClient client) {
        if (!list.contains(client)) {
            list.add(client);
            client.setMeditor(this);
        }
    }

    /**
     * 执行客户的请求
     * @param client
     */
    @Override
    void replay(AbstractClient client) {
        for(AbstractClient ob:list)
        {
            if(!ob.equals(client))
            {
                ((AbstractClient)ob).receiver();
            }
        }
    }
}
