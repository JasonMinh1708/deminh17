public class Product {
    private String id;
    private String description;
    private int numberInStock;
    private int numberSold;
    private double costPrice;
    private double salePrice;

    // Constructor
    public Product(String id, String description, int numberInStock,
                   double costPrice, double salePrice) {
        this.id = id;
        this.description = description;
        this.numberInStock = numberInStock;
        this.numberSold = 0;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    // buyQuantity method
    public void buyQuantity(int quantity) {
        this.numberInStock += quantity;
    }

    // sellOne method
    public boolean sellOne() {
        if (numberInStock >= 1) {
            numberInStock--;
            numberSold++;
            return true;
        }
        return false;
    }

    // getMarkUp method
    public double getMarkUp() {
        return salePrice - costPrice;
    }

    // getProfit method
    public double getProfit() {
        return numberSold * getMarkUp();
    }

    // toString method
    public String toString() {
        return "Product ID: " + id + "\n" +
               "Description: " + description + "\n" +
               "Number Sold: " + numberSold + "\n" +
               "Number in Stock: " + numberInStock + "\n" +
               "Cost Price: " + costPrice + "\n" +
               "Sale Price: " + salePrice + "\n" +
               "Mark Up: " + getMarkUp() + "\n" +
               "Total Profit: " + getProfit();
    }

    // Getter for ID (needed in Inventory class)
    public String getId() {
        return id;
    }

    // Getter for numberSold (needed for finding most popular)
    public int getNumberSold() {
        return numberSold;
    }
}
