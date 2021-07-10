import java.util.Scanner;
import java.util.regex.*;

class Solution {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pattern p = Pattern.compile("[369]");
		Matcher m;
		String r;
		for(int i=1;i<=n;i++) {
			r="";
			m=p.matcher(String.valueOf(i));
			while(m.find())	r+='-';
			if(r.equals(""))	System.out.printf("%d ",i);
			else	System.out.printf("%s ",r);
		}
	}
}
