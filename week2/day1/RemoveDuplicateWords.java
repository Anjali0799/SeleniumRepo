package week2.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn Java basics as part of java sessions in java week1";
		
		String[] words= text.split(" ");
		
		int count=0;
		
		for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                // Check for duplicates (case-insensitive) and not already removed
                if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
                    words[j] = "";  // Replace duplicate with empty string
                    count++;        // Increment duplicate count
                }
            }
        }

        // Check if duplicates were found and print the result
       if (count > 0) {
           System.out.println("Modified String without duplicates:");
            for (String word : words) {
                if (!words.equals("")) {
                    System.out.print(words + " ");
                }
            
        else {
            System.out.println("No duplicates found.");
        }
            }
        }
	}
}

