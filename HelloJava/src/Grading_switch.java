import java.util.Scanner;
public class Grading_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gd;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		
		int score = scanner.nextInt();
		score /= 10;
		switch(score){
		case 10:
			gd = 'A';
			break;
		case 9:
			gd = 'A';
			break;
		case 8:
			gd = 'B';
			break;
		case 7:
			gd = 'C';
			break;
		case 6:
			gd = 'D';
			break;
		default:
			gd = 'F';
		}
		
		System.out.println("학점은 "+ gd+"입니다.");
		scanner.close();
		
	}

}