package inheritanceMethod;

public class studentPsm {
	protected String fname;
	protected String lname;
	public double gpa;
	public String majors;
	
	public void setName(String fn, String ln) {
		fname = fn;
		lname = ln;
	}
	public String getName() {
		return "Name = " + fname + " " + lname;
	}
	public void setGpa(double g) {
		gpa = g;
	}
	public double getGpa() {
		return gpa;
	}

}
