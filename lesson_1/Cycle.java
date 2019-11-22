public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + " ");	
		}

		int k = 6;
		while (k >= -6) {
			System.out.println(k + " ");
			k-=2;
		}

		int t = 9;
		do {
			t+=2;
			System.out.println(t + " ");		
		} while (t < 19);	
	}
}