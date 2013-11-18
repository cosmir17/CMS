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
            cmd.execute(dataStore);

            //commands and main classes built first
            //command is an abstract class
            //other command classes inherits 'command class'
            //Commodity, DealerID and Side classes are enums
            //


        }
    }

}
