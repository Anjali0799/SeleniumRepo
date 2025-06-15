package week1.day2;

public class IsPrime {
	
	   public static void main(String[] args) {
	        int num = 13; // Declare the number

	        boolean isPrime = true;

	        
	        {
	            if (num % 2 == 0) {
	                isPrime = false;
	                
	            }
	        }

	        
	        if (isPrime) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
	    }
	}