package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
        // Get user input
        System.out.println("Enter the number of terms for the Fibonacci series: ");
        int range = 8;

        // Initial terms
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        // Generate and print Fibonacci series
        for (int i = 0; i < range; i++) {
        	System.out.print(a + (i <= range-1 ? ", " : ""));
            int c= a + b;
            a = b;
            b = c;
        }

	}

}
