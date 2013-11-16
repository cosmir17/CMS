/**
 * Created with IntelliJ IDEA.
 * User: lloydp
 * Date: 16/11/13
 * Time: 13:51
 * To change this template use File | Settings | File Templates.
 */
public class CheckCommand extends Command {


    private int orderID;
    //all three things now loading, jpm(dealer id), 100(orderID) revoke(order)


    public CheckCommand(DealerID dealer, int orderID) {
        super(dealer);
        this.orderID = orderID;

    }


    @Override
    void execute(DataStore dataStore) {
        System.out.println("valid check command");
        //To change body of implemented methods use File | Settings | File Templates.

    }


}

