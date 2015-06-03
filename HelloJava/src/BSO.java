
public class BSO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = (short)10;
		short b = (short)20;
		
		System.out.println("[비트 연산 결과]");
		System.out.printf("%d\n", (short)a&b);
		System.out.printf("%d\n", (short)a|b);
		System.out.printf("%d\n", (short)a^b);
		System.out.printf("%d\n", (short)~a);
		
		byte c = 20;
		byte d = -8;
		
		System.out.println("[시프트 연산 결과]");
		System.out.println(c << 2);
		System.out.println(c >> 2);
		System.out.println(d >> 2);
		System.out.printf("%x\n", (d>>>2));
		
		System.out.println(c < 2);
	}

}
