package commonLibs;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import commonLibsInterfaces.IWindowHandle;

public class WindowHandle implements IWindowHandle{
	private WebDriver driver;
	public WindowHandle(WebDriver Driver) {
		this.driver=Driver;
	}

	@Override
	public void switchToChildWindow() throws Exception {
	driver.switchTo().window(getWindowHandles().toArray()[1].toString());
	
		
	}

	@Override
	public void switchToParentWindow() throws Exception {
		driver.switchTo().window(getWindowHandle());
		
		
	}

	@Override
	public String getWindowHandle() throws Exception {
		return driver.getWindowHandle();
	}

	@Override
	public Set<String> getWindowHandles()throws Exception {
		return driver.getWindowHandles();
		
	}

}
