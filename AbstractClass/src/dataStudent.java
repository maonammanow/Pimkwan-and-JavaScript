
public class dataStudent extends stuPsm {
	private String name,majors;
	private int age;

	@Override
	public void setName(String n) {
		name = n;
		System.out.println("Name : " + name);
		
	}

	@Override
	public void setAge(int a) {
		age = a;
		System.out.println("Age : " + age);
		
	}

	@Override
	public void setMajors(String ma) {
		majors = ma;
		System.out.println("Major : " + majors);
		
	}

	@Override
	public float gpa() {
		
		return 0;
	}

}
