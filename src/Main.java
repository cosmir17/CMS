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
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            Command cmd = Parser.parseCommand(scan.nextLine());
            cmd.execute();
        }
    }

}
