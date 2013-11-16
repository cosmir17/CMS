/**
 * Created with IntelliJ IDEA.
 * User: lloydp
 * Date: 16/11/13
 * Time: 14:47
 * To change this template use File | Settings | File Templates.
 */
public class ListCommand extends Command {


    private void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    Commodity commodity;

    private void setCommodityDealer(DealerID commodityDealer) {
        this.commodityDealer = commodityDealer;
    }

    DealerID commodityDealer;


    public ListCommand(DealerID dealer) {
        super(dealer);
        commodity = null;
        commodityDealer = null;
    }

    public ListCommand(DealerID dealer, Commodity commodity){
        this(dealer);
        setCommodity(commodity);
    }

    public ListCommand(DealerID dealer, Commodity commodity, DealerID commodityDealer){
        this(dealer, commodity);
        setCommodityDealer(commodityDealer);
    }


    @Override
    void execute(DataStore dataStore) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("valid list command");
    }

}
