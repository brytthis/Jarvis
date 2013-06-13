import java.util.Scanner;

public class jarv {
	static String task;
	static String checker;
	static String vstup;
	private static Scanner in;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Jsem pripraven");
		ctecka();
		aktivator();
	}
	
	public static void ctecka(){
		in = new Scanner(System.in);
		checker=in.nextLine();
	}
	public static void aktivator(){
		System.out.println(checker);
		if(checker.equals("ahoj")){
			System.out.println("baf");
			database();
		}
		else if(checker.equals("cau")){
			System.out.println("baf");
			database();
		}
		else if(checker.equals("zdar")){
			System.out.println("baf");
			database();
		}
		main(null);
	}
	public static void database(){
		System.out.println("Nasloucham, zadejte prikaz.");
		task=in.nextLine();
		System.out.println(task);
	}

}
