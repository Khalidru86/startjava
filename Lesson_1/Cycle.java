public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i < 21; i++) {
			System.out.println(i + " ");
		}

		int i = 6;
		while (i >= -6) {
			System.out.print(i + " ");
		i -= 2;
		}

		int i = 13;
		int result = 11;
		do {
			result = result + i;
			if(result % 2 == 0) {
					System.out.println("Число " + result + " является четным");
			} else {
					System.out.println("Число " + result + " является нечетным");
			}
			i+=2;
		} while(i <= 19);

		System.out.println("11 + 13 +  15 + 17 + 19 = " + result);
	}
}