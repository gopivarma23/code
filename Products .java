public class Products {
	
	public static String category = "Electronics";
    public String productName;

    public static void main(String[] args) {
        System.out.println("Category Name: " + category);

      
        Products f2 = new Products();
        f2.productName = "Laptop";
        System.out.println("Product Name: " + f2.productName);

       
        Products f3 = new Products();
        f3.productName = "Smartphone";
        System.out.println("Product Name: " + f3.productName);
    }
}
