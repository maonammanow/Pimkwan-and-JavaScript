package javaInputOutput;
import java.util.Scanner;

public class scannerInputOutput {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String fname=" ";
		String lname=" ";
		char gender;
		int age;
		float grade;
		
		System.out.print("Enter First Name = ");
		fname = kb.next();
		System.out.print("Enter Last Name = ");
		lname = kb.next();
		System.out.print("Enter Gender = ");
		gender = kb.next().charAt(0);
		System.out.print("Enter Age = ");
		age = kb.nextInt();
		System.out.print("Enter Grade = ");
		grade = kb.nextFloat();
		
		System.out.println("Name : "+ fname+"  "+lname);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("Grade : "+grade);
	}

}
