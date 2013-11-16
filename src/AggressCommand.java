import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: lloydp
 * Date: 16/11/13
 * Time: 14:42
 * To change this template use File | Settings | File Templates.
 */
public class AggressCommand extends Command {

    private HashMap<Integer, Integer> orderToAmount;

    public AggressCommand(DealerID dealer, HashMap<Integer, Integer> orderToAmount) {
               super(dealer);
        this.orderToAmount = orderToAmount;

    }

    @Override
    void execute(DataStore dataStore) {
        System.out.println("valid aggress cmd");
    }
}
