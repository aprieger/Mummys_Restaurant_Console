import java.sql.*;
import java.util.*;


public class CustomerMenuUI {
    
    public static void main(String[] args) {
        int custId=1234;
        Scanner read = new Scanner(System.in);
        while (true) {
            System.out.println("\t\t\t\tMenu\n" 
                    + "--------------------------------------------------------------------------------------------------------------------------------------------\n"
                    + Package.getMenu()
                    + "-->Enter the package number to view\n"
                    + "-->Enter \"Checkout\" to go to Checkout");
            String userInput="";
            userInput = read.next();
            if (userInput.toLowerCase().trim().equals("checkout")) {
                System.out.println(">>>>To checkout");
                //TOTO: Go to Checkout UI
            }
            else if (userInput.matches("[-+]?\\d*\\.?\\d+")) {
                //GOTO: Package Information UI
                CustomerPackageUI toPackage = new CustomerPackageUI();
                toPackage.goToPackageUI(userInput);
            }
            else
                System.out.println(">>>>Invalid input");
        }
    }
}