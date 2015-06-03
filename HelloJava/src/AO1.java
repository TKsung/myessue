import java.util.Scanner;

public class AO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int time = scanner.nextInt();
		
		System.out.print(time + "초는 ");
		
		int day = time / 86400;
		time = time % 86400;
		int hr = time/3600;
		time = time%3600;
		int min = time/60;
		int sec = time%60;
		
		System.out.print(day + "일, ");
		System.out.print(hr + "시간, ");
		System.out.print(min + "분, ");
		System.out.println(sec + "초입니다.");
		
		scanner.close();		

	}

}
