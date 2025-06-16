package week1.day3;

public class Browser {
	
	
	String launchBrowser(String browserName) {
        System.out.println("Browser launched successfully");
        return browserName;
    }
	
	void loadUrl() {
        System.out.println("Application url loaded successfully");
    }
	
  public static void main(String[] args) {
	  Browser browser = new Browser();
	  browser.launchBrowser("chrome");
	  browser.loadUrl();
  
   }
}
