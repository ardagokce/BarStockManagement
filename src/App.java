// main runner App.java

// necessary imports
import java.util.Scanner;

// Provider class
class Provider {
    public void menuProvider (Stocks TheStocks){

        Scanner scanner = new Scanner(System.in);
        // +TheStocks creates bullshit numbers here along with the name...
        System.out.println("What would you like to do with " + TheStocks.toString());
        System.out.println("1)Add\n 2)Check\n 3)Exit\n");
        Drinks drinks = new Drinks();

        int i = scanner.nextInt();

        switch (i) {
            case 1:
                TheStocks.setBrand();
                TheStocks.setPname();
                TheStocks.setQuantity();
                TheStocks.setEntryDate();
                TheStocks.setExpirationDate();
                TheStocks.setPrice();
                if(TheStocks.type() == "Drinks"){
                    drinks.setAlc();
                }else break;
            case 2:
                TheStocks.getBrand();
                TheStocks.getPname();
                TheStocks.getQuantity();
                TheStocks.getEntryDate();
                TheStocks.getExpirationDate();
                TheStocks.getPrice();
                if(TheStocks.type() == "Drinks"){
                    if(drinks.getAlc()){
                        System.out.println("The Drink is alcoholic.");
                    }
                }
            case 3:
                System.out.println("Exited successfully\n");
                break;
        }
    }

}

public class App {
       
    public static void main(String[] args) throws Exception {
      
        Scanner s = new Scanner(System.in);
        Stocks TheStocks = null;
        Provider menu = new Provider();

        System.out.println("Welcome to your stacks managements system bitch.\n");
        System.out.println("Please choose what you would like to handle:\n");
        System.out.println("Foods or Drinks?\n");

        String input = s.nextLine();
        // needs to accept any type of capitalization of input
        switch(input){
            case "Foods":
                menu.menuProvider(TheStocks = new Foods());
                break;
            case "Drinks":
                menu.menuProvider(TheStocks = new Drinks());
                break;
            default:
                System.out.println("Wrong input dipshit.\n");
                break;
        }
    }   
}
