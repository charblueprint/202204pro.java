package 예제;
import java.util.Scanner; 
public class GradeSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("학점을 입력하세요>> ");
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.next();
		switch(grade) {
			case "A": case "B":
				System.out.println("Excellent");
				break;
			case "C": case "D":
				System.out.println("Good");
				break;
			case "F": 
				System.out.println("Bye!");
				break;
		default: 
			System.out.println("다시 입력하시오");
		}
		
		scanner.close();
	}

}
