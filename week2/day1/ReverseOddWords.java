package week2.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		
		String[] words= test.split(" ");
		
		for (int i = 0; i<words.length; i++) {
			
			if (i % 2 != 0) {
				
				char[] chars = words[i].toCharArray();
                for (int j = chars.length - 1; j >= 0; j--) {
                    System.out.print(chars[j]);
                }
            } else {
                // Print the word as it is for even index
                System.out.print(words[i]);
            }

            // Print space after each word except the last
            if (i < words.length - 1) {
                System.out.print(" ");
            }
        }
    }
}