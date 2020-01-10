package TC;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;


public class LoginTC extends BaseScenario {

	@Test
	public void validUsernameAndPassword() throws Exception {
		
		try {
			login.ValidUsernameAndPassword();
			assertEquals(home.username(), "amarshakya");
		} catch (Exception e) {
//			extent.ReportFail("in valid usernme and password");
		}
	}
	
	
}
