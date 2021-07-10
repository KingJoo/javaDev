package try_catch;

public class DirectTryCatch {
	public static void main(String[] args) {
		try {
			int[] a = {10,0};
			//System.out.println(a[2]);
			//System.out.println(a[0]/a[1]);
			//String s="10 ";int c = Integer.parseInt(s);
			//a=null;System.out.println(a[1]);
			//Object o = new Object();Main m = new Main();m=(Main)o;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(ClassCastException e) {
			System.out.println(e.getMessage());
		}catch(RuntimeException e) {//기타에러
			
		}
		
	}
}
//사용자 정의 예외 처리(반드시 Exception을 상속받아 처리)
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
