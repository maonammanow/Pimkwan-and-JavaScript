package staticMethod;
import java.util.Scanner;

public class CreateMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		setName();
		System.out.print("Enter Age = ");
		int a = scan.nextInt();
		//int a = 15;
		int age = Age(a);
		//System.out.println("Age = " + Age(a));
		System.out.println("Age = " + age);
	}
	//private public protected
	private static void setName() {
		System.out.println("Pimkwan Chiraprawattrakun (Pim)");
	}
	private static int Age(int age) {
		return age;
	}
}
