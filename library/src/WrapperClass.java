
public class WrapperClass {
	public static void main(String[] args) {
		int a = 10;
		// 오토박싱
		Integer i = a;
		System.out.println(i);
		Integer i1 = new Integer(a);
		System.out.println(i1);
		Integer i2 = new Integer("10");
		System.out.println(i2);
		// 언박싱
		int b = i;
		System.out.println(b);
		int c = i.intValue();
		System.out.println(b);
		
		// 진법 표현
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toOctalString(c));
		System.out.println(Integer.toHexString(c));
	}
}