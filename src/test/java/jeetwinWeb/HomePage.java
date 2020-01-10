package jeetwinWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.WebElementControl;
import commonLibsInterfaces.IWebElementControl;

public class HomePage {

	private IWebElementControl element;
	
	@FindBy(css="span.fullusername")
	private WebElement fullusername;
	
	public HomePage (WebDriver driver) {
		element = new WebElementControl();
		
		PageFactory.initElements(driver, this);
	}
	
	public String username() throws Exception {
		return element.getText(fullusername);
	}
	
	
}
