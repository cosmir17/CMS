/**
 * Created with IntelliJ IDEA.
 * User: lloydp
 * Date: 16/11/13
 * Time: 13:45
 * To change this template use File | Settings | File Templates.
 */
public class InvalidCommand extends Command{

    @Override
    void execute(DataStore dataStore) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("This is an invalid command");
    }
}
