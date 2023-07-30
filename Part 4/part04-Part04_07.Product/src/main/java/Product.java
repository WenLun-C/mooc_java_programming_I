public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String iName, double iPrice, int iQuantity) {
        this.name = iName;
        this.price = iPrice;
        this.quantity = iQuantity;
    }

    public void printProduct() {
        System.out.println(this.name + ", " + "price " + this.price + ", "+ this.quantity +" pcs");
    }
}
