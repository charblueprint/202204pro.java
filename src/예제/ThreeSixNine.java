package 예제;

public class ThreeSixNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int num=1; num<=99; num++) {
			int first = num/10;
			int second = num%10;
			int baksu = 0;
			
			if(first==3 || first==6 || first==9) {
				baksu++;
				System.out.println();
			
			if(second==3 || second==6 || second==9)
				baksu++;
		
			switch(baksu) {
			case 0 : System.out.print("X");
						break;
			case 1 : System.out.print("박수한번");
						break;
			case 2 : System.out.print("박수두번");
						break;
			
		}
		
		
		
		
		
		}
	}
}

	
