import java.util.Scanner;

public class sumReverse {
		public static void main(String[] args) {
			
			int n,a,m = 0, sum = 0;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the number:- ");
			n = in.nextInt();
			do {
				a = n % 10;
				m = m * 10 + a;
				sum = sum + a;
				n = n / 10;
				
			}while(n>0);
			System.out.println("Sum :- "+sum);
			System.out.println("Reverse :- "+m);
			System.out.println("Digit :- "+n);
		}
}
