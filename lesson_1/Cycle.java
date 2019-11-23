public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + " ");	
		}

		int i = 6;
		while (i >= -6) {
			System.out.println(i + " ");
			i -= 2;
		}

		int sumOdd = 0;
		int counter = 10;
		do {
			if(sumOdd % 2 == 0) {
				sumOdd += counter;
				System.out.println(sumOdd + " ");
			}
			counter++;			
		} while (counter <= 20);	
	}
}