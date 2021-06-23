package test;

import java.util.Arrays;

//1~45 6
public class ArrayPrac4 {
	public static void main(String[] args) {
		final int NUM=6, LIMIT = 46;
		int[] lotto=new int[NUM];
		boolean[] check=new boolean[LIMIT];
		for(int i=0;i<lotto.length;) {
			lotto[i]=(int)(Math.random()*LIMIT);
			if(check[lotto[i]]==false)
				check[lotto[i++]]=true;
		}
		System.out.println(Arrays.toString(lotto));
	}
}
