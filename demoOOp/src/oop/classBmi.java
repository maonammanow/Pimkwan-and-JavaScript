package oop;

public class classBmi {
	public String fname;
	public String lname;
	public float weight;
	public float height;
	public float bmi;
	
	public void setName(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		System.out.print(this.fname + " ");
		System.out.print(this.lname);
	}
	
	public float calBmi(float weight, float height) {
		this.weight = weight;
		this.height = height/100;
		bmi = weight/(this.height*this.height);
		return bmi; 
	}
	
	public static void Standard_Bmi(float bmi) {
		if (bmi < 18.50) {
			System.out.println("underweight");
		}
		else if (bmi >= 18.50 & bmi <= 22.90) {
			System.out.println("normal");
		}
		else if (bmi >= 23.00 & bmi <= 24.90) {
			System.out.println("overweight");
		}
		else if (bmi >= 25.00 & bmi <= 29.90) {
			System.out.println("obese");
		}
		else {
			System.out.println("extremely obese");
		}
	}

}
