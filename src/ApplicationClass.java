import javax.swing.*;
import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;

public class ApplicationClass {

    public static void main(String[] args) {
        int input;
        String menuInput;
        TableClass table;
        int tableInput;
        RunningOrder ro = new RunningOrder();

        //validate input
        while(true) {
            while (true) {
                tableInput = TableClass.selectTableNumber();
                if (tableInput > 0 && tableInput < 5) {
                    table = new TableClass(tableInput, ro);
                    break;
                } else {
                    System.out.println("Invalid Input, try again.");
                }
            }

                /*
                Display Menu
                 */

        //    while (true) {
                input = TableClass.displayMenu();

                switch (input) {
                    case (1) -> ro.reset();
                    case (2) -> ro.addToOrder();
                    case(3) -> System.out.println("Testing case 3");
                    }
                }


//                input = JOptionPane.showInputDialog("Choose another table? 'Y' or 'N'");
//                if (!(input.equalsIgnoreCase("y"))) {
//                    break;
//                }
            }
        }
          //  System.out.println("Done");



     //   }


