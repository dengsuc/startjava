public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + " ");	
		}
		int k = 6;
		while (k >= -6) {
			System.out.println(k + " ");
			k = k + 1;
		}
		int t = 10;
		do {
			t = t + 1;
			System.out.println(t + " ");
		} while (t <= 20);	
	}
}