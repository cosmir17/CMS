import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: lloydp
 * Date: 16/11/13
 * Time: 12:45
 * To change this template use File | Settings | File Templates.
 */
public class Parser {
    //noun parser
    //interface is adjective, e.g. serializable
    // inheritance (abstract class): noun, can grab what it is
    //interface : abjective, description
    //polymorphism, whatever comes in

    private Parser() {
        //this 'private' prevents a user from initiating an instance of this class.
    }

    enum OrderType {
        POST,
        REVOKE,
        CHECK,
        AGGRESS,
        LIST
    }


    //we won't make any object
    static Command parseCommand(String line) {
        try {
            String commandParsedArray[] = line.split("\\s+");
            String orderTypeString = commandParsedArray[1];
            orderTypeString.toUpperCase();
            OrderType type = OrderType.valueOf(orderTypeString);

            Command result;

            switch (type) {
                case CHECK:
                    result = parseCheckCommand(commandParsedArray);
                    break;
                case REVOKE:
                    result = parseRevokeCommand(commandParsedArray);
                    break;
                case POST:
                    result = parsePostCommand(commandParsedArray);
                    break;
                case AGGRESS:
                    result = parseAggressCommand(commandParsedArray);
                    break;
                case LIST:
                    result = parseListCommand(commandParsedArray);
                    break;
                default:
                    result = new InvalidCommand();
            }

            return result;
        } catch (Exception e) {
            return new InvalidCommand();
        }

    }

    private static Command parseListCommand(String[] commandParsedArray) {
        try {
            DealerID dealer = DealerID.valueOf(commandParsedArray[0]);
            if (commandParsedArray.length == 2) {
                return new ListCommand(dealer);
            } else if (commandParsedArray.length == 3) {
                Commodity commodity = Commodity.valueOf(commandParsedArray[2]);
                return new ListCommand(dealer, commodity);
            } else if (commandParsedArray.length == 4) {
                Commodity commodity = Commodity.valueOf(commandParsedArray[2]);
                DealerID commodityDealer = DealerID.valueOf(commandParsedArray[3]);
                return new ListCommand(dealer, commodity, commodityDealer);
            } else {
                return new InvalidCommand();
            }
        } catch (Exception e) {
            return new InvalidCommand();
        }
    }

    private static Command parseAggressCommand(String[] commandParsedArray) {
        try {
            DealerID dealer = DealerID.valueOf(commandParsedArray[0]);
            HashMap<Integer, Integer> orderToAmount = new HashMap<Integer, Integer>();

            for (int i = 2; i < commandParsedArray.length; i += 2) {
                int order = Integer.parseInt(commandParsedArray[i]);
                int amount = Integer.parseInt(commandParsedArray[i + 1]);
                orderToAmount.put(order, amount);
            }

            return new AggressCommand(dealer, orderToAmount);
        } catch (Exception e) {
            return new InvalidCommand();
        }
    }

    private static Command parsePostCommand(String[] commandParsedArray) {
        try {
            DealerID dealer = DealerID.valueOf(commandParsedArray[0]);
            Side side = Side.valueOf(commandParsedArray[2]);
            Commodity commodity = Commodity.valueOf(commandParsedArray[3]);
            int amount = Integer.parseInt(commandParsedArray[4]);
            double price = Double.parseDouble(commandParsedArray[5]);

            return new PostCommand(dealer, side, commodity, amount, price);
        } catch (Exception e) {
            return new InvalidCommand();
        }
    }

    private static Command parseCheckCommand(String[] commandParsedArray) {

        try {
            int orderID = Integer.parseInt(commandParsedArray[2]);
            DealerID dealer = DealerID.valueOf(commandParsedArray[0]);

            return new CheckCommand(dealer, orderID);
        } catch (Exception e) {
            return new InvalidCommand();
        }

    }

    private static Command parseRevokeCommand(String[] commandParsedArray) {
        try {
            int orderID = Integer.parseInt(commandParsedArray[2]);
            DealerID dealer = DealerID.valueOf(commandParsedArray[0]);

            return new RevokeCommand(dealer, orderID);
        } catch (Exception e) {
            return new InvalidCommand();
        }
    }
}
