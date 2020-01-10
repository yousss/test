package jeetwinWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.ExtentFactory;
import commonLibs.TextboxControls;
import commonLibs.WebElementControl;
import commonLibsInterfaces.ITextbox;
import commonLibsInterfaces.IWebElementControl;

public class Login {
	
	private IWebElementControl element;
	private ITextbox textbox;
	
	@FindBy(xpath="//form[@class='horizontal loginForm']/button")
	private WebElement loginbtn;
	
	@FindBy(css="input[placeholder=Username]")
	private WebElement username;
	
	@FindBy(css="input[placeholder=Password]")
	private WebElement password;
	
	public Login(WebDriver Driver) {
		element = new WebElementControl();
		textbox = new TextboxControls();
		PageFactory.initElements(Driver, this);
	}
	
	public void ValidUsernameAndPassword() throws Exception {
		textbox.setText(username, "amarshakya");
		textbox.setText(password, "Welcome1");
		element.click(loginbtn);
		
	}
	

}
