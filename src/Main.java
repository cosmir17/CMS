import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lloydp
 * Date: 16/11/13
 * Time: 12:30
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        //any PrintStream can be imported
        DataStore dataStore = new DataStore(System.out);
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            Command cmd = Parser.parseCommand(scan.nextLine());
            //HOW DOES IT IDENTIFY WHICH COMMAND METHOD IT WILL USE?
            cmd.execute(dataStore);

            //Commands and main classes built first
            //Command is an abstract class
            //other command classes inherits 'command class'
            //Commodity, DealerID and Side classes are enums
            //In parser class, it calls each Command methods(AggressCommand, CheckCommand and )

            //when 'cmd.execute' runs 'execute(dataStore)' method in each command class and
            //it uses a method in dataStore class in order to do something with the data structure(hashmap)
            //data store methods also have messages to print out to the print stream.
            //dataStore.checkOrder(getDealer(), orderID);


        }
    }

}
