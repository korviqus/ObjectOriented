package LabWorks;

public class Product {
    private String name;
    private int quantity;
    private double price;
    private int productId;
    private static int idCounter;

    public Product() {
        this("Unknown", 0, 0.00);
    }

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.productId = idCounter;
        idCounter++;
    }

    public String getName() {
        return this.name;
    }

    public int getProductId() {
        return this.productId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public double getItemValue() {
        return this.price * this.quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public void setPrice(double price) {
        if (price >= 0.00) {
            this.price = price;
        } else {
            this.price = 0.00;
        }
    }

    public String toString() {
        return name + Double.toString(this.price);
    }

    public static void main(String[] args){
        Product newProduct = new Product("Gentoo disc",23, 300.00);
        Product newProductTwo = new Product();
        System.out.println(newProduct.getProductId());
    }
}

