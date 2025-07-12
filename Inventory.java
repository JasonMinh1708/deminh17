import java.util.*;
public class Inventory{
    public static final int MAX_SIZE = 500;
    private Product[] collection;
    private int size;
    
    public Inventory(){
        this.size = 0;
        collection = new Product[MAX_SIZE];
    }
    
    public int search(String id){
        for(int i = 0; i < size; i++)
        {
            if(collection[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean addProduct(){
        if(size == MAX_SIZE){
            System.out.println("The product list reaches limit!");
            return false;
        }
        else{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter product id: ");
        String id = in.nextLine();
            if(search(id) != -1)
            {
                System.out.println("This product already exists!");
                return false;
            }
            else {
                System.out.print("Enter product description: ");
                String description = in.nextLine();
                System.out.print("Enter product stock number: ");
                int stock = in.nextInt();
                System.out.print("Enter product cost price: ");
                double cost = in.nextDouble();
                System.out.print("Enter product sale price: ");
                double sale = in.nextDouble();
                in.nextLine();
                collection[size] = new Product(id, description, stock, cost, sale);
                System.out.print("Product added sucessfully!");
                size++;
                return true;
            }
        }
    }
    
    public boolean sell(String id){
        int d = search(id);
        if(d == -1){
            System.out.println("No product found with this id.");
            return false;
        }
        else
        return collection[d].sellOne();
        
    }
    
    public void sort(){
        for(int i = 0; i<size; i++){
            for(int j = 0; j < size-i-1; j++)
            if(collection[j].getProfit() < collection[j+1].getProfit()){
                Product t = collection[j];
                collection[j] = collection[j+1];
                collection[j+1] = t;
            }
        }
    }
    
    public void stringg(){
        for(int i = 0; i < size; i++){
        System.out.println(collection[i].toString());
        }
    }
}