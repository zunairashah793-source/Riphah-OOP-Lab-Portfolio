import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;
    private static int totalProducts = 0;

    public Product() {
        totalProducts++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public void displayProduct() {
        System.out.println("Product: " + getName());
        System.out.printf("Price: Rs. %.2f%n", getPrice());
        System.out.println("Quantity: " + getQuantity());
    }
}

public class ProductCounter {
    private static final Scanner INPUT = new Scanner(System.in);

    private static Product readProduct(int productNumber) {
        Product product = new Product();

        System.out.println("\nEnter details for Product " + productNumber + ":");

        System.out.print("Name: ");
        product.setName(INPUT.nextLine().trim());

        product.setPrice(readNonNegativeDouble("Price: "));
        product.setQuantity(readNonNegativeInt("Quantity: "));

        return product;
    }

    private static double readNonNegativeDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (INPUT.hasNextDouble()) {
                double value = INPUT.nextDouble();
                INPUT.nextLine();
                if (value >= 0) {
                    return value;
                }
                System.out.println("Value cannot be negative. Try again.");
            } else {
                System.out.println("Please enter a valid number.");
                INPUT.next();
            }
        }
    }

    private static int readNonNegativeInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (INPUT.hasNextInt()) {
                int value = INPUT.nextInt();
                INPUT.nextLine();
                if (value >= 0) {
                    return value;
                }
                System.out.println("Value cannot be negative. Try again.");
            } else {
                System.out.println("Please enter a whole number.");
                INPUT.next();
            }
        }
    }

    public static void main(String[] args) {
        Product firstProduct = readProduct(1);
        Product secondProduct = readProduct(2);

        System.out.println("\n--- Product Details ---");
        firstProduct.displayProduct();

        System.out.println();
        secondProduct.displayProduct();

        System.out.println("\nTotal products created: " + Product.getTotalProducts());

        INPUT.close();
    }
}
