package salanium2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportterLog {    // when write in true then show in output
								//	false then not show in out put
	@Test
	public void m1() {
		Reporter.log("M1 is Executed" , true);
	}
	@Test
	public void m20() {
		Reporter.log("M20 is Executed" , false);
	}
	@Test
	public void m13() {
		Reporter.log("M13 is Executed" , false);
	}
	@Test
	public void m33() {
		Reporter.log("M33 is Executed" , true );
	}
	@Test
	public void m25() {
		Reporter.log("M25 is Executed" , false);
	}
}
