
public class Shirt {

    public int shirtID = 1;
    public String description = "Regular red shirt...";
    public String belong = "...it's belong to Oleksandr!";
    public String colorCode = "Red";
    public double price = 5.99;
    public int quantityInStock = 10;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println(belong);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}

 class ShirtTest {

    public static void main(String args[]) {
        Shirt myShirt = new Shirt();
        myShirt.displayShirtInformation();
    }
}
