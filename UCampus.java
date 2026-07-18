public class UCampus {

    // Instance Variables
    int itemId;
    String itemName;
    double price;

    // Static Variables
    static String cafeteriaName = "UCampus Cafeteria";
    static double serviceCharge = 10.0;
    static int totalFoodItems = 0;

    void addFoodItem(int id, String name, double p) {
        itemId = id;
        itemName = name;
        price = p;
        totalFoodItems++;
    }

    double calculateFinalPrice() {
        return price + (price * serviceCharge / 100);
    }

    void displayItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Original Price : " + price);
        System.out.println("Final Price : " + calculateFinalPrice());
        System.out.println();
    }

    static void changeServiceCharge(double newCharge) {
        serviceCharge = newCharge;
    }

    static void displayCafeteriaDetails() {
        System.out.println("Cafeteria Name : " + cafeteriaName);
        System.out.println("Service Charge : " + serviceCharge + "%");
        System.out.println("Total Food Items : " + totalFoodItems);
        System.out.println();
    }

    public static void main(String[] args) {

        UCampus item1 = new UCampus();
        UCampus item2 = new UCampus();
        UCampus item3 = new UCampus();

        item1.addFoodItem(101, "Veg Sandwich", 80);
        item2.addFoodItem(102, "Cold Coffee", 120);
        item3.addFoodItem(103, "Paneer Wrap", 150);

        displayCafeteriaDetails();

        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();

        changeServiceCharge(15);

        System.out.println("After Updating Service Charge\n");

        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();
    }
}
