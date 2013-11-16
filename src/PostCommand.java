/**
 * Created with IntelliJ IDEA.
 * User: lloydp
 * Date: 16/11/13
 * Time: 14:08
 * To change this template use File | Settings | File Templates.
 */
public class PostCommand extends Command {


    private Side side;
    private Commodity commodity;
    private int amount;
    private double price;

    //all three things now loading, jpm(dealer id), 100(orderID) revoke(order)


    public PostCommand(DealerID dealer, Side side, Commodity commodity, int amount, double price) {
        super(dealer);
        this.side = side;
        this.commodity = commodity;
        this.amount = amount;
        this.price = price;

    }


    @Override
    void execute() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("valid post command");
    }

}

