package apcs.Inheritance;

public class GroceryBillDriver {
    public static void main(String[] args) {
        Item item1 = new Item("Bag of apples", 5.00, 1.00);
        Item item2 = new Item("Kale", 4.50, .50);
        Item item3 = new Item("Almond butter", 8.75, 0);
        Item item4 = new Item("Paper towels", 6.50, .25);
        Item item5 = new Item("Dark chocolate bar", 1.25, 0);

        GroceryBill groceryBill = new GroceryBill("Greg", 5);
        groceryBill.add(item1);
        groceryBill.add(item2);
        groceryBill.add(item3);
        groceryBill.add(item4);
        groceryBill.add(item5);
        groceryBill.printReceipt();
    }
}
