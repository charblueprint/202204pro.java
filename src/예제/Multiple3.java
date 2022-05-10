package 예제;
import java.util.Scanner;
public class Multiple3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수 10개 입력>> ");
		Scanner scanner= new Scanner(System.in);
		int[] num = new int [10];
		
		for(int i=0; i<10; i++) {
			num[i] = scanner.nextInt();
		}
		
		
		for(int i=0; i<10; i++) {
			if(num[i]%3==0) 
				System.out.print(num[i]+ " ");
			}	
		scanner.close();
		
	}
			
}
