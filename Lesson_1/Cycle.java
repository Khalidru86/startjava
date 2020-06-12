public class Cycle {
	public static void main (String[] args) {
	   for(int i = 0; i < 21; i++) {
	      System.out.print(i + " ");
	   }

	   int i = 6;
	   while (i >= -6) {
	      System.out.println(i + " ");
	      i-= 2;
	   }

	   // int i = 9;
	   // int result = 1;
	   // do {
	   //    result = result + i;
	   //    i+=2;
	   //    System.out.println(i + " ");
	   // } while(i <= 18);
	   // System.out.println("11 + 13 + 15 + 17 + 19 = " + result);
    }
}


