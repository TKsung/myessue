import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gd;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		
		int score = scanner.nextInt();
		if(score>90)
			gd = 'A';
		else if(score >=80)
			gd = 'B';
		else if(score >=70)
			gd = 'C';
		else if(score >=60)
			gd = 'D';
		else
			gd = 'F';
		
		System.out.println("������ "+ gd+"�Դϴ�.");
		scanner.close();
		
	}

}
