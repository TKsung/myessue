import java.util.Scanner;

public class AO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int time = scanner.nextInt();
		
		int sec = time % 60;
		int min = (time/60) % 60;
		int hour = (((time/60)/60)%24);
		int day = ((time/60)/60)/24;
		
		System.out.print(time + "�ʴ� ");
		System.out.print(day + "��, ");
		System.out.print(hour + "�ð�, ");
		System.out.print(min + "��, ");
		System.out.println(sec + "���Դϴ�.");
		
		scanner.close();		

	}

}
