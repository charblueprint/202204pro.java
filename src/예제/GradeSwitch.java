package ����;
import java.util.Scanner; 
public class GradeSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������ �Է��ϼ���>> ");
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
			System.out.println("�ٽ� �Է��Ͻÿ�");
		}
		
		scanner.close();
	}

}
