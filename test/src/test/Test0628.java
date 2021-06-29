package test;


class NoName{
	private static String[] menu= {""};
	String data1;
	String data2;
	String data3;
	NoName(){}
	public static void menuUpdate(String[] s) {
		menu=s;
	}
	public static void menuPrint() {
		System.out.println("=============== menu ===============");
		for(String s : menu)
			System.out.println(s);
	}
	
}

public class Test0628 {
	public static void main(String[] args) {
		String[] menu = {"1. ","2. ","3. ","4. "};
		NoName.menuPrint();
		NoName.menuUpdate(menu);
		NoName.menuPrint();
	}
}
