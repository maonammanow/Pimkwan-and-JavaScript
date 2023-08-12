import java.util.Scanner;

public class report {
	public static void main(String[] args) {
		String id , name ;
		float price;
		int numberProduct;
		
		Scanner scan = new Scanner(System.in);
		
		sale s = new sale();
		s.shopName();
		
		System.out.println("Enter ID Product : ");
		id = scan.next();
		
		System.out.println("Enter Name Product : ");
		name = scan.next();
		
		System.out.println("Enter Price Product : ");
		price = scan.nextFloat();
		
		System.out.println("Enter Number Product : ");
		numberProduct = scan.nextInt();
		
		s.detailProduct(id, name, price);
		s.buyProduct(numberProduct);
	}

}
