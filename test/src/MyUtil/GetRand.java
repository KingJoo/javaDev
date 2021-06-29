package MyUtil;

import java.util.Arrays;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GetRand {
	// 중복없는 난수 발생
	int[] arr;
	public void getRandWithoutDuplicate(int n, int limitStart, int limitEnd) {
		// limitEnd-limitStart+1<n -> 예외처리하기 (범위보다 난수 발생할 갯수가 많으면 중복없이 난수발생 불가능)
		try {
			if(n>10000000)	throw new Exception("n value is too big, Make it small");
			if(limitEnd-limitStart+1<n)	throw new Exception("n value is bigger than limit range, Increase limit range");
			arr = new int[n];
			boolean[] b = new boolean[limitEnd + 1];
			for (int i = 0; i < n;) {
				arr[i] = (int) (Math.random() * (limitEnd - limitStart + 1)) + limitStart;
				if (!b[arr[i]])
					b[arr[i++]] = true;
			}
		} catch (Exception e) {
			System.out.println("getRandWithoutDuplicate(int n, int limitStart, int limitEnd)");
			System.out.println("error : " + e.getMessage());
		}
	}
	
	public void print() {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) throws Exception{
		GetRand rd = new GetRand();
		rd.getRandWithoutDuplicate(1000000000,0,1000000000);
		rd.getRandWithoutDuplicate(33,0,10);
		rd.getRandWithoutDuplicate(6,1,10);
		rd.print();
	}
}