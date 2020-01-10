package TC;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import commonLibs.CommonDriver;
import commonLibs.ExtentFactory;
import commonLibsInterfaces.IDriver;
import jeetwinWeb.HomePage;
import jeetwinWeb.Login;

@SuppressWarnings("unused")
public class BaseScenario {
	IDriver cmnDriver;
	String Url = "https://jwv2.gpms365.net";
	Login login;
	HomePage home;

	
	@BeforeMethod
	public void setup () throws Exception {
		cmnDriver = new CommonDriver("chrome");
		cmnDriver.openBrowser(Url);
		
		login = new Login(cmnDriver.getDriver());
		home = new HomePage(cmnDriver.getDriver()) ;
		
	}
	@AfterMethod
	public void close () throws Exception {
		cmnDriver.closeBrowser();
	}
	
}
