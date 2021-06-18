package test;

public class _8 {
	public static void main(String[] args) {
		int[] arr = {94,85,95,88,90};
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int a : arr) {
			min = min > a ? a : min;
			max = max < a ? a : max;
		}
		System.out.println("최소값 : " + min + '\n' + "최대값 : " + max);
		
	}
}
