package ����;

import java.util.Scanner;

public class PrintAlphabetWithoutA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���>> ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char c = s.charAt(0);
		String Alpha = "abcdefghijklmnopqrstuvwxyz";
		
		int a = Alpha.indexOf(c);
		
		for (int i=0; i < a+1; i++) {
			for (int j=i; j< a+1; j++) {
				System.out.print(Alpha.charAt(j));
			}
			System.out.println();
		}
	}
}
