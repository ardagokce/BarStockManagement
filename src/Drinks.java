// Stocks extending class Drinks.java

// necessary imports
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Drinks extends Stocks {
    LocalDate entryDate;
    LocalDate expirationDate;
    BigDecimal price;
    boolean alc;
  
    // Scanner constructor for inputs 
      Scanner scanner = new Scanner(System.in);
      DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy MM dd");

      // Set Methods 
      public void setBrand(){
          System.out.println("Please enter brand name:\n");
          this.brand = scanner.nextLine();
      }
      public void setPname(){
          System.out.println("Please enter product name:\n");
          this.product_Name = scanner.nextLine();
      }
      public void setQuantity(){
          System.out.println("Please enter quantity:\n");
          this.quantity = scanner.nextInt();
      }
      public void setEntryDate(){
        // fix date , tries to parse without input
        System.out.println("Please enter entry date [yyyy: mm: dd]:\n");
        this.entryDate = LocalDate.parse(scanner.nextLine(), f);
      }
      public void setExpirationDate(){
        System.out.println("Please enter expiration date [yyyy: mm: dd]:\n");
        this.expirationDate = LocalDate.parse(scanner.nextLine(), f);
      }
      public void setPrice(){
        System.out.println("Please enter price:\n");
        this.price = scanner.nextBigDecimal();
      }
      public void setAlc(){
        System.out.println("Is the product alcoholic?(y/n):\n");

        if(scanner.nextLine() == "y"){
            this.alc = true;
        }
        else if(scanner.nextLine() == "n"){
            this.alc = false;
        }
        else {
            System.out.println("Wrong input dipshit!\n");
        }
      }

      // Get Methods
      public String type(){
        return "Drinks";
      }
      public String getBrand() {
          return brand;
      }
      public String getPname() {
          return product_Name;
      }
      public int getQuantity() {
          return quantity;
      }
      public LocalDate getEntryDate() {
        return this.entryDate;
      }
      public LocalDate getExpirationDate(){
        return this.expirationDate;
      }
      public BigDecimal getPrice() {
        return this.price;
      }
      public boolean getAlc(){
        return this.alc;
      }

    }