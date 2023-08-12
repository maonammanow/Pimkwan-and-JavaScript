package inheritanceMethod;

public class student extends studentPsm {
	
	String subject;
	String nickName = "Pim";
	
	public student() {
		subject = "JAVA OOP";
		majors = "IT";
	}
	public String getName() {
		return "Name = " + fname + " " + lname + " " + nickName;
	}
	public void printData() {
		System.out.println("Subject = " + subject);
		System.out.println("GPA = " + gpa);
	}

	public static void main(String[] args) {
		student stu1 = new student();
		student stu2 = new student();
		
		stu1.setName("Pimkwan","Chiraprawattrakun");
		stu1.setGpa(3.99);
		System.out.println(stu1.getName());
		//System.out.println(stu1.getGpa());
		stu1.printData();
		
		stu2.setName("นาย a","นามสกุล b");
		stu2.setGpa(2.99);
		System.out.println(stu2.getName());
		//System.out.println(stu2.getGpa());
		stu2.printData();

	}

}
