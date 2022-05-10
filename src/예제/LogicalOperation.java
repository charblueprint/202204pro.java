package 예제;
import java.util.Scanner;
public class LogicalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("논리연산을 입력하세요>> ");
		Scanner scanner = new Scanner(System.in);
		boolean a = scanner.nextBoolean();
		String op = scanner.next();
		boolean b = scanner.nextBoolean();
		switch(op) {
			case "AND" : System.out.println(false);
			break;
			case "OR" : System.out.println(true);
			break;
		}
	scanner.close();
	}
	

}
