package test;

public class StoC_CtoS_Sort {
	public static void main(String[] args) {
		String s = "ADBHCEOPEK";
		System.out.println(s);

		char[] alp = new char[s.length()];
		for (int i = 0; i < s.length(); i++)
			alp[i] = s.charAt(i);
		for (int i = 0; i < alp.length - 1; i++)
			for (int j = 0; j < alp.length - 1 - i; j++)
				if (alp[j] > alp[j + 1]) {
					alp[j] ^= alp[j + 1];
					alp[j + 1] ^= alp[j];
					alp[j] ^= alp[j + 1]; // System.out.println(Arrays.toString(arr));
				}
		s = s.valueOf(alp);
		System.out.println(s);
	}
}
