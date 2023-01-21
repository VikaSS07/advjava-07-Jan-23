import java.util.Scanner;

public class CartApplication {
	public static void main(String[] args) {
		
		System.out.println("Please Enter You Option ");
		System.out.println("1. Add Product into cart");
		System.out.println("2. Update Product from cart");
		System.out.println("3. Remove Product from cart");
		System.out.println("4. Checkout");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Your Choice : ");
		int value = scan.nextInt();
		
		switch(value) {
			case 1: 
				addProduct();
				break;
			case 2: 
				updateProduct();
				break;
			case 3: 
				removeProduct();
				break;
			case 4: 
				generateBill();
				break;
			default:
				System.exit(0);
					
		}
		
	}
	
	public static void addProduct() {
		// Get the Product Details using scanner and insert into Table
	}
	
	
	public static void updateProduct() {
		// Get the Product Details using scanner and update into Table
	}
	
	
	public static void removeProduct() {
		// Get the Product id using scanner and delete the product from Table
	}
	
	public static void generateBill() {
		// Get the Product Details from Table and display into formated way.
	}
	
	
	
	
}
