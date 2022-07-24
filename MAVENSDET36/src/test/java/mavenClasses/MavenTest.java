package mavenClasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenTest {
	@Test
public void display() {
		Reporter.log("TestCase");
	
}
	@Test
	public void display1() {
		Reporter.log("Testcase is pass");
	}
}
