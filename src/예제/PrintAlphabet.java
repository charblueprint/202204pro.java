package ����;
import java.util.Scanner;
public class PrintAlphabet {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���>> ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char c = s.charAt(0);
		int a = c-96;
		
		for (int i=0; i<a; i++) {
			for (int j=i; j<a; j++) {
				System.out.print((char)(j+97));
			}
			System.out.println();
		}
			
	

	}

}
