package mavenClasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenClassTest {
	@Test
public void show() {
	Reporter.log("hari",true);
	//modified repository
}
	@Test
	public void show1() {
		Reporter.log("mouni",true);
		//final repository
	}
}
