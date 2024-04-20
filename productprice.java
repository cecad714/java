class Product {
    String pcode, pname;
    float price;

    public Product(String pcode, String pname, float price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
}

public class ProductPrice {
    public static void main(String[] args) {
        Product p1 = new Product("01", "IceCream", 100);
        Product p2 = new Product("02", "Biscuit", 150);
        Product p3 = new Product("03", "Cake", 200);

        System.out.println("All Products:");
        printProductDetails(p1);
        printProductDetails(p2);
        printProductDetails(p3);

        Product lowp = p1;
        if (p2.price < lowp.price) {
            lowp = p2;
        }
        if (p3.price < lowp.price) {
            lowp = p3;
        }

        System.out.println("The Product with the lowest price:");
        printProductDetails(lowp);
    }

    public static void printProductDetails(Product product) {
        System.out.println("Product Code: " + product.pcode);
        System.out.println("Product Name: " + product.pname);
        System.out.println("Product Price: " + product.price + "\n");
    }
}
