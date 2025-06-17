package week1.day3;

public class Library {

      String addBook(String bookTitle) {
			
			System.out.println("Book added successfully");
			return bookTitle;
			
		}
       void issueBook() {
			
			System.out.println("Book issued successfully");
			
			
		}
      public static void main(String[] args) {
          // Create an object of Library
          Library lib = new Library();
          lib.addBook("Book added successfully");
          lib.issueBook(); 
	
      
  }
}


