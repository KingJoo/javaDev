package test;

public class Method3_idCheck_99dan {
	static boolean isIdCheck(String id) {
		String[] ids = {"admin","hong","shim","park","lee","kim","jeong","KooAng"};
		for(String s:ids)
			if(id.equals(s))	return true;
			//if(id.equalsIgnoreCase(s))
		return false;
	}
	static int rand() {
		return (int)(Math.random()*9)+1;
	}
	static void gugudan(int dan) {
		for(int i=1;i<=9;i++)
			System.out.printf("%d * %d = %2d\n",dan,i,dan*i);
	}
	public static void main(String[] args) {
		if(isIdCheck("kim"))	System.out.println("이미 사용중인 아이디 입니다.");
		else System.out.println("사용 가능한 아이디 입니다.");
		int a = rand();
		System.out.println("임의의 정수 : "+a);
		gugudan(a);
	}
}
