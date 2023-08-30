import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
public class UserStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<String,Integer>items=new HashMap<>();
        System.out.println("Store Inventory System");
        System.out.println("-----------------------");
        System.out.println("1. Add Item");
        System.out.println("2. Check Quantity");
        System.out.println("3. Remove Item");
        System.out.println("4. List Inventory");
        System.out.println("5. Exit");
        boolean exit=false;
        while (!exit){
            System.out.println("Enter your choice: ");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Item name: ");
                    String userfruitschoice=scanner.next().toLowerCase();
                    System.out.println("Enter quantity: ");
                    int Amount=scanner.nextInt();
                    items.put(userfruitschoice,Amount);
                    System.out.println("Item "+ userfruitschoice+ " added to inventory");
                    break;
                case 2:
                    System.out.println("Enter item name: ");
                    String userinput=scanner.next().toLowerCase();
                    if(items.containsKey(userinput)){
                        System.out.println("Quantity of "+ userinput+" in Inventory: "+items.get(userinput));
                    }else{
                        System.out.println("Item "+ userinput+ " not found in inventory");
                    }
                    break;
                case 3:
                    System.out.println("Enter item name: ");
                    String removeitem=scanner.next().toLowerCase();
                    if(items.containsKey(removeitem)){
                        items.remove(removeitem);
                        System.out.println("Item "+ removeitem+ " removed from the inventory");
                    }else {
                        System.out.println("Item "+ removeitem+ " not found in inventory");
                    }
                    break;
                case 4:
                    System.out.println("Inventory: ");
                    Iterator displayitem=items.keySet().iterator();
                    Iterator displayquantity=items.values().iterator();
                    while (displayitem.hasNext()){
                        System.out.println("- "+displayitem.next()+ ": " + displayquantity.next());
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    exit=true;
                    break;
                default:
                    System.out.println("Enter the number from 1-5");
                    break;
            }
        }
    }
}
