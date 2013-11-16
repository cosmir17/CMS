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

    public void postOrder(Order order) {

        idToOrder.put(id, order);

        out.println(id + " " +
                order.getDealer() + " " +
                order.getSide() + " " + " " +
                order.getCommodity() + " " +
                order.getAmount() + " " +
                order.getPrice() + " " +
                "HAS BEEN POSTED");

        id++;
    }

    public void revokeOrder(DealerID dealer, int id) {
        if (!idToOrder.containsKey(id)) {
            out.println("UNKNOWN ORDER");
            return;
        }

        if(!idToOrder.get(id).getDealer().equals(dealer)) {
            out.println("UNAUTHORIZED");
            return;
        }

        idToOrder.remove(id);
        out.println(id + " HAS BEEN REVOKED");
    }
}
