// Stocks extending class Drinks.java

import java.time.LocalDate;
import java.util.Scanner;

class Drinks extends Stocks {
        // Scanner constructor for inputs 
        Scanner scanner = new Scanner(System.in);
        
        float price = 0;
        boolean alcoholic = false;
        LocalDate entryDate;
  
        // Set Methods 
        public void setBrand(String b){
            String brand = null;

            System.out.println("Please enter brand name:\n");
            brand = scanner.toString();

        }
        public void setPname(String p){
            String product_Name = null;

            System.out.println("Please enter product name:\n");
            product_Name = scanner.toString();
        }
        public void setQuantity(int q){
            int quantity = 0;

            System.out.println("Please enter product name:\n");
            quantity = scanner.nextInt();
        }

        // Get Methods
        public String getBrand() {
            return brand;
        }
        public String getPname() {
            return product_Name;
        }
        public int getQuantity() {
            return quantity;
        }
    }