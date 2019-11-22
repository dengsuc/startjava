public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + " ");	
		}

		int i = 6;
		while (i >= -6) {
			System.out.println(i + " ");
			i-=2;
		}

		int result = 1;
		int i1 = 9;
		do {
			result = result + i1;
			if(result % 2 == 0) {
				System.out.println(result + " ");
			}
			i1++;			
		} while (i1 <= 20);	
	}
}