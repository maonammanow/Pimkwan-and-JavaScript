package ConstructorBox;
import java.util.Scanner;

public class box1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w,h,d;
		
		System.out.println("Enter w = ");
		w = sc.nextDouble();
		System.out.println("Enter h = ");
		h = sc.nextDouble();
		System.out.println("Enter d = ");
		d = sc.nextDouble();
		
		Box b = new Box(w,h,d);
		
		System.out.print("BOX = " + b.volume());

	}

}
