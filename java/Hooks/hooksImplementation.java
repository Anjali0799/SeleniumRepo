package Hooks;

import Base.baseclass;
import io.cucumber.java.BeforeStep;

public class hooksImplementation extends baseclass {

	
	@BeforeStep
	public void slowMo() throws InterruptedException {
		Thread.sleep(1000);
	}
	
}
