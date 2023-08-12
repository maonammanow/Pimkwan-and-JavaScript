
public abstract class stuPsm {
	protected char grade = 'A'; 
	
	public abstract void setName(String n);
	public abstract void setAge(int a);
	public abstract void setMajors(String ma);
	public abstract float gpa();
	
	public void grade(char g) {
		grade = g;
		System.out.println("Grade = " + grade);
		System.out.println("    ");
	}
}
