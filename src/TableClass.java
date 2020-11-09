import javax.swing.*;

public class TableClass {

    private int tableNumber;
    private RunningOrder runningOrder;


    //constructors
    public TableClass() {
        this(0, null);
    }

    public TableClass(int tableNumber, RunningOrder runningOrder) {
        this.tableNumber = tableNumber;
        this.runningOrder = runningOrder;
    }

    public int getTableNumber()
    {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber)
    {
        this.tableNumber = tableNumber;
    }

    public RunningOrder getRunningOrder()
    {
        return runningOrder;
    }

    public void setRunningOrder(RunningOrder runningOrder)
    {
        this.runningOrder = runningOrder;
    }


    public static int selectTableNumber(){
        String input;
        input = JOptionPane.showInputDialog("Please select a table number:");
        int inputInt = Integer.parseInt(input);
        if (inputInt >= 1 && inputInt <= 4) {
            return inputInt;
        }
        else {
            return -1;
        }
    }

        public static int displayMenu(){
        String str = JOptionPane.showInputDialog( "1. Reset Table\n2. Add to Order\n3. Delete from the Order"
            + "\n4. Display  total bill.\n5. Change Table Identifier");
        return Integer.parseInt(str);
    }

    @Override
    //how to do this with the running Order class?
    public String toString() {
        return "TableClass{" +
                "tableNumber=" + tableNumber +
                ", runningOrder=" + runningOrder +
                '}';
    }



}
