package staticMethod;
import java.util.Scanner;

public class parameterMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		open();
		System.out.print("Enter Music name : ");
		play(scan.nextLine());
		
		int m,s;
		System.out.print("Enter minute : ");
		m = scan.nextInt();
		System.out.print("Enter second : ");
		s = scan.nextInt();
		
		seekto(s,m);
	}
	public static void open() {
		System.out.println("Music Started");
	}
	public static void play(String name) {
		System.out.println("Playing Music" + " : " + name);
	}
	public static void seekto(int sec, int min) {
	System.out.println("Seek music to " + min + ":" + sec);
	}
	/*public static int seekto(int sec, int min) {
		return min + sec; //ค่าreturnจะบวกกันเป็นค่าเดียว เหมาะกับการรวมเลขมากกว่า
	}*/
}
