/**
 * Created with IntelliJ IDEA.
 * User: lloydp
 * Date: 16/11/13
 * Time: 16:03
 * To change this template use File | Settings | File Templates.
 */
public class Order {
    private DealerID dealer;

    public Side getSide() {
        return side;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {

        return amount;
    }

    public Commodity getCommodity() {

        return commodity;
    }

    public DealerID getDealer() {

        return dealer;
    }

    private Side side;
    private Commodity commodity;
    private int amount;
    private double price;

    Order(DealerID dealer, Side side, Commodity commodity, int amount, double price) {
        this.dealer = dealer;
        this.side = side;
        this.commodity = commodity;
        this.amount = amount;
        this.price = price;

        //This is for making an order object, so that it doesn't use

    }
}

