package 예제;
import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("돈의 액수를 입력하시오>> ");
		int[] coin  = {50000, 10000, 5000, 1000, 500, 100, 10,1};
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=0; i<coin.length; i++) {
			System.out.println(coin[i] + "원:" + num/coin[i]);
			num%= coin[i];
		}
			
	scanner.close();
	}
	      
}
