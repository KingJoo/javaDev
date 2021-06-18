package test;

public class ArrMinMax {
	public static void main(String[] args) {
		final int N =300, LIMIT=101;
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * LIMIT);
		
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for (int a : arr) {
			min = min > a ? a : min;
			max = max < a ? a : max;
		}
		
		System.out.println("최소값 : " + min + '\n' + "최대값 : " + max);
	}
}
