import com.sun.jdi.CharType;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class RunningOrder {

    String input;
    private int totalPrice;
    private int numberOfItemsInThisOrder;

    //what's on the running order?
    //which items order + number of each item
    //cost of those items
    //total cost of all items.

    private String[] menuItems = {"A" , "B" , "C" , "D" , "E"};
    private int A, B, C, D, E;
    public int[] numberOfEachItem = {0,0,0,0,0};

    //what is the best way to populate this?

    public RunningOrder() {
        this(null, null, 0, 0);

    }

    public RunningOrder(String[] menuItems, int[] numberOfEachItem, int totalPrice, int numberOfItemsInThisOrder) {
        this.menuItems = menuItems;
        this.numberOfEachItem = numberOfEachItem;
        this.totalPrice = totalPrice;
        this.numberOfItemsInThisOrder = numberOfItemsInThisOrder;

    }

    //resets table to zero
    public void reset() {
        this.menuItems = null;
        this.numberOfEachItem = null;
        this.totalPrice = 0;
        this.numberOfItemsInThisOrder = 0;
    }

    //actual items to order
//
//    public void setOrderedItems(String item, int numberOfSpecificItems){
//      int cost = getPrice(item, numberOfSpecificItems);
//      this.orderedItems.put(item, cost);
//
//      }
    public void addToOrder() {
           selectMenuItems();

    }

//    //user selects items
    public void selectMenuItems() {
        while (true) {
            input = JOptionPane.showInputDialog("Select an item to add to your order\n" +
                    "A:  $20\n" +
                    "B:  $23\n" +
                    "C:  $18\n" +
                    "D:  $17\n" +
                    "E:  $ 8\n");


         //   if(input.charAt(0)>64 && input.charAt(0)<70){
                int index = menuIndex(input);
                String formattedInput = String.format("How many %s would you like to order?", input);

                String temp = JOptionPane.showInputDialog(formattedInput);
                Integer number = Integer.parseInt(temp);

                numberOfEachItem[index] += number;
                totalPrice += getPrice(index, number);


                //increase the letters int? -- create a method increase alpha?

            String str = JOptionPane.showInputDialog("Hit 'Enter' to input another item or 'E' to Exit");
            if(str.equalsIgnoreCase("e")) {
                break;
            }
            else{
                continue;
            }
        }

    }

//    public void incrementMenuItems(int index, int quantity){
//             numberOfEachItem[index] += quantity;
//    }


//    //build pricing grid
    private int getPrice(int index, int numberOfItems){
        if(index == 0){
            return 20 * numberOfItems;
        } if(index == 1){
            return 23 * numberOfItems;
        } if(index == 2){
            return 18 * numberOfItems;
        } if(index == 3){
            return 17 * numberOfItems;
        } if(index == 4){
            return 8 * numberOfItems;
        }
        else{
            System.out.println("Error, invalid selection!");
        }
        return 0;
    }

    public int menuIndex(String item){
        if(item.trim().equalsIgnoreCase("a")){
            return 0;
        }
        else if(item.trim().equalsIgnoreCase("b")){
            return 1;
        }
        else if(item.trim().equalsIgnoreCase("c")){
            return 2;
        }
        else if(item.trim().equalsIgnoreCase("d")){
            return 3;
        }
        else if (item.trim().equalsIgnoreCase("3")){
            return 4;
        }
        else{
            System.out.println("Error, invalid input. No calculation performed. ");
            return 0;
        }
    }


    public int menuIndex(int price){
        if(price == 20){
            return 0;
        }
        else if(price == 23){
            return 1;
        }
        else if(price == 18){
            return 2;
        }
        else if(price == 17){
            return 3;
        }
        else if (price == 8){
            return 4;
        }
        else{
            System.out.println("Error, invalid input. No calculation performed. ");
            return 0;
        }
    }








}