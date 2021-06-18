package test;

public class _9 {
	public static void main(String[] args) {
		final int N =10, LIMIT=11;
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * LIMIT);
		
		int sum=0;
		System.out.print("랜덤한 정수들 : ");
		for (int a : arr) {
			sum+=a;
			System.out.print(a+" ");
		}
		System.out.printf("\n평균은 %.1f",sum/(double)N);
	}
}
