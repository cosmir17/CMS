/**
 * Created with IntelliJ IDEA.
 * User: lloydp
 * Date: 16/11/13
 * Time: 14:08
 * To change this template use File | Settings | File Templates.
 */
public class PostCommand extends Command {


    private Order order;

    public PostCommand(DealerID dealer, Side side, Commodity commodity, int amount, double price) {
        super(dealer);
        this.order = new Order(dealer, side, commodity, amount,price);
    }


    //all three things now loading, jpm(dealer id), 100(orderID) revoke(order)


    @Override
    void execute(DataStore dataStore) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("valid post command");
        dataStore.postOrder(order);

    }

}

