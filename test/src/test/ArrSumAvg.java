package test;

public class ArrSumAvg {
	public static void main(String[] args) {
		final int N =300,LIMIT=101;
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * LIMIT);
		int sum = 0;
		for (int a : arr)
			sum += a;
		System.out.printf("총합 : %d\n평균 : %.2f",sum,sum/(double)arr.length);
	}
}
