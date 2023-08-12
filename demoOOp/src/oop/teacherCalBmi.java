package oop;
import java.util.Scanner;

public class teacherCalBmi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		classBmi b = new classBmi();
		float w,h,bmi;
		b.fname = ("Kunha");
		b.lname = ("Radchakot (Eak)");
		b.height = 175;
		b.weight = 60;
		
		//System.out.print(b.fname + " ");
		//System.out.print(b.lname);
		
		b.setName(b.fname, b.lname);
		b.calBmi(b.weight,  b.height);
		//System.out.println(b.height);
		System.out.println(b.bmi);
		b.Standard_Bmi(b.bmi);

	}

}
