package ����;
import java.util.Scanner;
public class GBBWithComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		System.out.print("���� ���� ��!>>");
		String str[] = {"����", "����", "��"};
		int i;
		
		while(true) {
			int n = (int)(Math.random()*3);
			String s = scanner.next();
			if(s.equals("�׸�")) 
				break;
			
			for(i=0; i<str.length; i++) {
				if(s.equals(str[i]))
					break;
				}
			
			if(i==n) { //����;0 ����;1 ��;2 
				System.out.println("����� = "+str[i]+" , ��ǻ�� = "+str[n]+" , �����ϴ�.");
				System.out.print("���� ���� ��!>> ");
				continue;
			}	
			else if((i==0 && n==2) || (i==1 && n==0) || (i==2 && n==1)) {
				System.out.println("����� = "+str[i]+" , ��ǻ�� = "+str[n]+" , ����ڰ� �̰���ϴ�.");
				System.out.print("���� ���� ��!>> ");
				continue;
			}
			else if((i==2 && n==0) || (i==0 && n==1) || (i==1 && n==2)) {
				System.out.println("����� = "+str[i]+" , ��ǻ�� = "+str[n]+" , ��ǻ�Ͱ� �̰���ϴ�.");
				System.out.print("���� ���� ��!>> ");
				continue;
			}	
		 System.out.println("������ �����մϴ�..");
		 break;
		}
		scanner.close();
	}

}
