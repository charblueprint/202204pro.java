package ����;
import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���� �׼��� �Է��Ͻÿ�>> ");
		int[] coin  = {50000, 10000, 5000, 1000, 500, 100, 10,1};
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=0; i<coin.length; i++) {
			System.out.println(coin[i] + "��:" + num/coin[i]);
			num%= coin[i];
		}
			
	scanner.close();
	}
	      
}
