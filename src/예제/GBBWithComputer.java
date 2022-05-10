package 예제;
import java.util.Scanner;
public class GBBWithComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		System.out.print("가위 바위 보!>>");
		String str[] = {"가위", "바위", "보"};
		int i;
		
		while(true) {
			int n = (int)(Math.random()*3);
			String s = scanner.next();
			if(s.equals("그만")) 
				break;
			
			for(i=0; i<str.length; i++) {
				if(s.equals(str[i]))
					break;
				}
			
			if(i==n) { //가위;0 바위;1 보;2 
				System.out.println("사용자 = "+str[i]+" , 컴퓨터 = "+str[n]+" , 비겼습니다.");
				System.out.print("가위 바위 보!>> ");
				continue;
			}	
			else if((i==0 && n==2) || (i==1 && n==0) || (i==2 && n==1)) {
				System.out.println("사용자 = "+str[i]+" , 컴퓨터 = "+str[n]+" , 사용자가 이겼습니다.");
				System.out.print("가위 바위 보!>> ");
				continue;
			}
			else if((i==2 && n==0) || (i==0 && n==1) || (i==1 && n==2)) {
				System.out.println("사용자 = "+str[i]+" , 컴퓨터 = "+str[n]+" , 컴퓨터가 이겼습니다.");
				System.out.print("가위 바위 보!>> ");
				continue;
			}	
		 System.out.println("게임을 종료합니다..");
		 break;
		}
		scanner.close();
	}

}
