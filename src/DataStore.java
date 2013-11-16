import java.io.PrintStream;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: lloydp
 * Date: 16/11/13
 * Time: 15:58
 * To change this template use File | Settings | File Templates.
 */
public class DataStore {
    final int INITIAL_ID = 0;

    private HashMap<Integer, Order> idToOrder;
    private int id;
    private PrintStream out;

    public DataStore(PrintStream out) {
        idToOrder = new HashMap<Integer, Order>();
        id = INITIAL_ID;
        this.out = out;
    }

    public void postNewOrder(Order order) {

        idToOrder.put(id++, order);

        out.println(id + " " +
                order.getDealer() + " " +
                order.getSide() + " " + " " +
                order.getCommodity() + " " +
                order.getAmount() + " " +
                order.getPrice() + " " +
                "HAS BEEN POSTED");

    }


}
