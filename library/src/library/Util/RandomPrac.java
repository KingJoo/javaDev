package library.Util;
import java.util.*;
public class RandomPrac {
	public static void main(String[] args) {
		//1~100
		int[] arr = new int[5];
		Random r = new Random();
		for(int i=0;i<5;i++) {
			arr[i]=r.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(arr));
	}
}
