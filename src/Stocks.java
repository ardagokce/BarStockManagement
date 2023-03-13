import java.math.BigDecimal;
import java.time.LocalDate;

// abstract class Stocks.java

abstract class Stocks {
    //attributes
    String brand;
    String product_Name;
    int quantity;

    // abstract set methods
    abstract void setBrand();
    abstract void setPname();
    abstract void setQuantity();
    abstract void setEntryDate();
    abstract void setExpirationDate();
    abstract void setPrice();

    // abstract get methods
    abstract String getBrand();
    abstract String getPname();
    abstract int getQuantity();
    abstract LocalDate getEntryDate();
    abstract LocalDate getExpirationDate();
    abstract BigDecimal getPrice();
    abstract String type();
}
