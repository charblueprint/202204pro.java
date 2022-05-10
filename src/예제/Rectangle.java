package 예제;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점 (x,y)의 좌표를 입력하세요>> ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if (((50<=x) && (50<=y)) || ((x<=100) && (y<=100))){
			System.out.println("점(" +x+ "," + y + ")은 (50, 50)과 (100, 100)의 사각형 내에 있습니다.");
		}	
		else {
			System.out.println("점(" +x+ "," + y + ")은 (50, 50)과 (100, 100)의 사각형 내에 없습니다.");	
		  scanner.close();
		}
			
		
	}
}
