import java.util.Scanner;

public class AO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int time = scanner.nextInt();
		
		System.out.print(time + "�ʴ� ");
		
		int day = time / 86400;
		time = time % 86400;
		int hr = time/3600;
		time = time%3600;
		int min = time/60;
		int sec = time%60;
		
		System.out.print(day + "��, ");
		System.out.print(hr + "�ð�, ");
		System.out.print(min + "��, ");
		System.out.println(sec + "���Դϴ�.");
		
		scanner.close();		

	}

}
