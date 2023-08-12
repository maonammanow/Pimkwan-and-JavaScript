package overloadStudent;

public class overload1 {
	static String n;
	static int a;
	public static void stu (String name) {
		n = name;
		System.out.println("Name = " + n);
	}
	public static void stu (int age) {
		a = age;
		System.out.println("Age = " + a);
	}

}
