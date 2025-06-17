package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
        // Declare the input number
        int input = 121;// You can change this value to test with other numbers
        int output=0;
        int input1 = 12345 ;   // To store the reversed number
        int output1 = 0;
        int originalInput = input; // Store original input for comparison
        int originalInput1 = input;
        // Reverse the number using a for loop
        for (int i = input; i > 0; i /= 10) {
            int rem = i % 10;          // Get the last digit
            output = output * 10 + rem; // Build the reversed number
        }

        // Check if the original number and reversed number are equal
        if (originalInput == output) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
        if (originalInput1 == output1) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}


