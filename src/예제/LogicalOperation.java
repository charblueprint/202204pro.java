package ����;
import java.util.Scanner;
public class LogicalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�������� �Է��ϼ���>> ");
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
