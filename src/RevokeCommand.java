/**
 * Created with IntelliJ IDEA.
 * User: lloydp
 * Date: 16/11/13
 * Time: 13:17
 * To change this template use File | Settings | File Templates.
 */
public class RevokeCommand extends Command {

    private int orderID;
    //all three things now loading, jpm(dealer id), 100(orderID) revoke(order)


    public RevokeCommand(DealerID dealer, int orderID) {
        super(dealer);
        this.orderID = orderID;
    }


    @Override
    void execute(DataStore dataStore) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("valid revoke command");
    }


}
