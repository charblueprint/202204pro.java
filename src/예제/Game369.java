package ����;
import java.util.Scanner;
public class Game369 {

		public static void main(String[] args) {
			System.out.print("1~99 ������ ������ �Է��ϼ���>> ");
			Scanner scanner = new Scanner(System.in);
			
			int num = scanner.nextInt();
			
			int first = num/10;
			int second = num%10;
			int baksu = 0;
			
			if(first==3 || first==6 || first==9)
				baksu++;
			if(second==3 || second==6 || second==9)
				baksu++;
			
			switch(baksu) {
				case 0 : System.out.println("�ڼ�����");
							break;
				case 1 : System.out.println("�ڼ�¦");
							break;
				case 2 : System.out.println("�ڼ�¦¦");
							break;
				default: break;		
			}
		}
}
