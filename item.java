package apcs.Inheritance;

public class Item {
    private String itemName;
    private double itemPrice;
    private double itemDiscount;

    public Item(String name, double itemPrice, double itemDiscount) {
        itemName = name;
        this.itemPrice = itemPrice;
        this.itemDiscount = itemDiscount;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return itemPrice;
    }

    public double getDiscount() {
        return itemDiscount;
    }

    public String toString() {
        return "Item: " + getItemName() + " Price: " + String.format("%.2f",getPrice()) + "\n\tToday's Discount: " + String.format("%.2f",getDiscount());
    }

}
