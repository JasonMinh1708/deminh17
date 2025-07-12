import java.util.Scanner;
public class TestInventory {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add a few products
        System.out.println("=== ADD PRODUCTS ===");
        inventory.addProduct(); // Bạn sẽ nhập từ bàn phím

        // Sell a product
        System.out.println("\n=== SELL PRODUCT ===");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter product id to sell: ");
        String productId = in.nextLine();
        inventory.sell(productId); // Giả sử bạn đã nhập P001

        // Sort by profit
        inventory.sort();

        // Show all products
        System.out.println("\n=== INVENTORY ===");
        inventory.stringg();
        in.close();
    }
}
