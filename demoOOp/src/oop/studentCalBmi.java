package oop;
import java.util.Scanner;

public class studentCalBmi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner kb = new Scanner(System.in);
		classBmi b = new classBmi();
		float weight,height,bmi;
		System.out.print("Enter First Name = ");
		b.fname = kb.next();
		System.out.print("Enter Last Name = ");
		b.lname = kb.next();
		System.out.print("Enter weight = ");
		b.weight = kb.nextInt();
		System.out.print("Enter height = ");
		b.height = kb.nextInt();
		
		//System.out.print(b.fname + " ");
		//System.out.print(b.lname);
		
		b.setName(b.fname, b.lname);
		b.calBmi(b.weight,  b.height);
		System.out.println(b.bmi);
		b.Standard_Bmi(b.bmi);

	}

}