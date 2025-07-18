package Week6.day1.Hooks;

import Week6.day1.Base.baseclass;
import io.cucumber.java.BeforeStep;

public class hooksImplementation extends Week6.day1.Base.baseclass {

	
	@BeforeStep
	public void slowMo() throws InterruptedException {
		Thread.sleep(1000);
	}
	
}
