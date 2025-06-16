package week2.day1;

import java.util.Iterator;

public class ChangeOddIndexValuestoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
		
		char[] charArray=test.toCharArray();
		
		for (int i=charArray.length-1; i>=0; i--) {
			if (i % 2 != 0) {
                // Convert to uppercase using Character.toUpperCase
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
			
		for (char ch : charArray) {
            System.out.print(ch);
        }	
			
		}

	}


