

public class Run{
	public static void main(String args[]) throws Exception{
		double start=System.nanoTime()/(double)(10E9);
		Solution.main();
		double end=System.nanoTime()/(double)(10E9);
		System.out.printf("%2.9fs\n", end - start);
	}
}