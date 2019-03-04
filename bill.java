package apcs.Inheritance;

public class GroceryBill{
    private String ClerkName;
    private int numOfItems;
    private Item[] Bill;
    private int indexOfBill;
    private double subtotal;
    private double tax;

    public GroceryBill(String ClerkName, int numOfItems){
        this.ClerkName=ClerkName;
        this.numOfItems=numOfItems;
        Bill=new Item[numOfItems];
        indexOfBill=0;
    }

    public void add(Item i){
        Bill[indexOfBill]=i;
        indexOfBill++;
    }

    public double getSubtotal(){
       subtotal=0;
       for (int i=0;i<numOfItems;i++){
           subtotal+=Bill[i].getPrice();
       }
       return subtotal;
    }

    public double getTax(){
        tax=0.0;
        tax=subtotal*.06;

        return tax;
    }

    public void printReceipt(){
        System.out.println("Clerk: "+ClerkName);
        System.out.println();
        for (int i=0;i<numOfItems;i++){
            System.out.println(Bill[i]);
        }
        System.out.println("\nSubtotal: "+ String.format("%.2f",getSubtotal()));
        System.out.println("Tax: "+ String.format("%.2f",getTax()));
        System.out.println("Total: "+ String.format("%.2f",(subtotal+tax)));
        System.out.println("\nThank you for shopping with us! \nHave a great day!");
        }
}
