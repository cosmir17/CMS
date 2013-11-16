/**
 * Created with IntelliJ IDEA.
 * User: lloydp
 * Date: 16/11/13
 * Time: 12:58
 * To change this template use File | Settings | File Templates.
 */
public abstract class Command {
    //it does execution
                           //every command has a dealer ID so let's put it here
    //could be string , enum
    Command() {}

    Command(DealerID dealer) {
        this.dealer = dealer;

    }

    private DealerID dealer;
    abstract void execute();
}
